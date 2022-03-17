package com.cmbc.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cmbc.gulimall.common.utils.PageUtils;
import com.cmbc.gulimall.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author dufuxing
 * @email dufxing@163.com
 * @date 2022-02-10 14:04:42
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

