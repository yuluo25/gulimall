package com.yuluo.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuluo.common.utils.PageUtils;
import com.yuluo.gulimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author yuluo
 * @email yuluo25@gmail.com
 * @date 2022-05-05 16:39:26
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

