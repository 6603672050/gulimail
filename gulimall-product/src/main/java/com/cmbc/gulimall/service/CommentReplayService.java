package com.cmbc.gulimall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cmbc.gulimall.common.utils.PageUtils;
import com.cmbc.gulimall.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author dufuxing
 * @email dufxing@163.com
 * @date 2022-02-09 17:10:01
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

