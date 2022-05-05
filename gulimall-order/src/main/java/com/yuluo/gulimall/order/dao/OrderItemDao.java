package com.yuluo.gulimall.order.dao;

import com.yuluo.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author yuluo
 * @email yuluo25@gmail.com
 * @date 2022-05-05 16:47:13
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
