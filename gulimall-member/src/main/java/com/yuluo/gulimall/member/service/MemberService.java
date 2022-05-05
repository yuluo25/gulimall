package com.yuluo.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuluo.common.utils.PageUtils;
import com.yuluo.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author yuluo
 * @email yuluo25@gmail.com
 * @date 2022-05-05 16:39:27
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

