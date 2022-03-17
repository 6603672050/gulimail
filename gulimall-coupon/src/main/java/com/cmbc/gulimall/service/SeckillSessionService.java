package com.cmbc.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cmbc.gulimall.common.utils.PageUtils;
import com.cmbc.gulimall.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author dufuxing
 * @email dufxing@163.com
 * @date 2022-02-10 14:04:42
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

