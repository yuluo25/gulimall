package com.yuluo.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuluo.common.utils.PageUtils;
import com.yuluo.gulimall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author yuluo
 * @email yuluo25@gmail.com
 * @date 2022-05-05 16:39:27
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

