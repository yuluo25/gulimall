package com.yuluo.gulimall.member.dao;

import com.yuluo.gulimall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author yuluo
 * @email yuluo25@gmail.com
 * @date 2022-05-05 16:39:26
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
