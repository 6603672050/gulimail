package com.cmbc.member.dao;

import com.cmbc.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author dufuxing
 * @email dufxing@163.com
 * @date 2022-02-24 15:06:09
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
