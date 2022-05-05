package com.yuluo.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yuluo.common.utils.PageUtils;
import com.yuluo.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author yuluo
 * @email yuluo25@gmail.com
 * @date 2022-05-05 16:47:13
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

