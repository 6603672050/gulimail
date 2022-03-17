package com.cmbc.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cmbc.gulimall.common.utils.PageUtils;
import com.cmbc.gulimall.entity.BrandEntity;
import com.cmbc.gulimall.entity.CategoryBrandRelationEntity;

import java.util.List;
import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author dufuxing
 * @email dufxing@163.com
 * @date 2022-02-09 17:10:01
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void updateById(Long catId, String name);

    void updateBrand(Long brandId, String name);

    List<BrandEntity> getBrandsByCatId(Long catId);
}

