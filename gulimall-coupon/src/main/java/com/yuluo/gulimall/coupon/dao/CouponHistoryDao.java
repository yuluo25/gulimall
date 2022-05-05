package com.yuluo.gulimall.coupon.dao;

import com.yuluo.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author yuluo
 * @email yuluo25@gmail.com
 * @date 2022-05-05 16:26:27
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
