package com.cmbc.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cmbc.gulimall.common.utils.PageUtils;
import com.cmbc.gulimall.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author dufuxing
 * @email dufxing@163.com
 * @date 2022-02-09 17:10:01
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> queryPageTree();

    void removeMenuByIds(List<Long> asList);

    Long[] fingCateLogPath(Long catelogId);

    void updateCasade(CategoryEntity category);
}

