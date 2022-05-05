package com.yuluo.gulimall.order.dao;

import com.yuluo.gulimall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author yuluo
 * @email yuluo25@gmail.com
 * @date 2022-05-05 16:47:12
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
