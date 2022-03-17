package com.cmbc.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cmbc.gulimall.common.utils.PageUtils;
import com.cmbc.ware.entity.PurchaseDetailEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author dufuxing
 * @email dufxing@163.com
 * @date 2022-02-24 15:24:16
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
    public List<PurchaseDetailEntity> listDetailByPurchaseId(Long id);
}

