package com.cmbc.gulimall.dao;

import com.cmbc.gulimall.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author dufuxing
 * @email dufxing@163.com
 * @date 2022-02-10 14:04:42
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
