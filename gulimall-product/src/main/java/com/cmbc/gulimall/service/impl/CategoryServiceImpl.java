package com.cmbc.gulimall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cmbc.gulimall.common.utils.PageUtils;
import com.cmbc.gulimall.common.utils.Query;
import com.cmbc.gulimall.dao.CategoryDao;
import com.cmbc.gulimall.entity.CategoryEntity;
import com.cmbc.gulimall.service.CategoryBrandRelationService;
import com.cmbc.gulimall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {
    @Autowired
    private CategoryBrandRelationService categoryBrandRelationService;
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> queryPageTree() {
        List<CategoryEntity> entities = baseMapper.selectList(null);
        List<CategoryEntity> level1Menu = entities.stream().filter((categoryEntity) -> {
            return categoryEntity.getParentCid() == 0;
        }).map((menu) -> {
            menu.setChildren(getChildren(menu, entities));
            return menu;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort()==null?0:menu1.getSort())-(menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
        return level1Menu;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        baseMapper.deleteBatchIds(asList);
    }

    @Override
    public Long[] fingCateLogPath(Long catelogId) {
        List<Long> paths = new ArrayList<Long>();

        List<Long> parentpaths = findByPath(catelogId,paths);
        Collections.reverse(parentpaths);
        return (Long[]) parentpaths.toArray(new Long[parentpaths.size()]);
    }

    @Override
    public void updateCasade(CategoryEntity category) {
        Long catId = category.getCatId();
        String name = category.getName();
        categoryBrandRelationService.updateById(catId,name);
    }

    private List<Long> findByPath(Long catelogId,List<Long> paths){
        paths.add(catelogId);
        CategoryEntity entity = this.getById(catelogId);
        if(entity.getParentCid()!=0){
                findByPath(entity.getParentCid(),paths);
            }
            return paths;
    }

    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> entities) {
        List<CategoryEntity> children = entities.stream().filter((categoryEntity) -> {
            return categoryEntity.getParentCid().equals(root.getCatId());
        }).map((categoryEntity -> {
            categoryEntity.setChildren(getChildren(categoryEntity,entities));
            return categoryEntity;
        })).sorted((menu1, menu2) -> {
            return (menu1.getSort()==null?0:menu1.getSort())-(menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
        return children;
    }

}