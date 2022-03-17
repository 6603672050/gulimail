package com.cmbc.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cmbc.gulimall.common.utils.PageUtils;
import com.cmbc.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author dufuxing
 * @email dufxing@163.com
 * @date 2022-02-24 15:06:09
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

