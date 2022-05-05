package com.yuluo.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuluo.common.utils.PageUtils;
import com.yuluo.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author yuluo
 * @email yuluo25@gmail.com
 * @date 2022-05-05 16:39:26
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

