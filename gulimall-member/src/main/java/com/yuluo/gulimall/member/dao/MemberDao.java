package com.yuluo.gulimall.member.dao;

import com.yuluo.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yuluo
 * @email yuluo25@gmail.com
 * @date 2022-05-05 16:39:27
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
