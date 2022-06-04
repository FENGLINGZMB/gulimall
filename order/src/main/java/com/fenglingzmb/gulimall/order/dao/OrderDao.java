package com.fenglingzmb.gulimall.order.dao;

import com.fenglingzmb.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author fenglingzmb
 * @email 3034636631@qq.com
 * @date 2022-06-04 22:35:03
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
