package com.cmbc.gulimall.dao;

import com.cmbc.gulimall.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 品牌分类关联
 * 
 * @author dufuxing
 * @email dufxing@163.com
 * @date 2022-02-09 17:10:01
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {

    void updateById(@Param("brandId") Long brandId,@Param("name")String name);

    void updateByCatId(@Param("catId")Long catId, @Param("name")String name);
}
