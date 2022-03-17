package com.cmbc.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cmbc.gulimall.common.utils.PageUtils;
import com.cmbc.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author dufuxing
 * @email dufxing@163.com
 * @date 2022-02-24 15:19:11
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

