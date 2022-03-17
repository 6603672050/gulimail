package com.cmbc.order.dao;

import com.cmbc.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author dufuxing
 * @email dufxing@163.com
 * @date 2022-02-24 15:19:11
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
