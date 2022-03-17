package com.cmbc.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cmbc.gulimall.common.utils.PageUtils;
import com.cmbc.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author dufuxing
 * @email dufxing@163.com
 * @date 2022-02-24 15:24:17
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

