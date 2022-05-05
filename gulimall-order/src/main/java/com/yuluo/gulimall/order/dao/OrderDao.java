package com.yuluo.gulimall.order.dao;

import com.yuluo.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yuluo
 * @email yuluo25@gmail.com
 * @date 2022-05-05 16:47:13
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
