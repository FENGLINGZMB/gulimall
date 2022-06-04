package com.fenglingzmb.gulimall.coupon.dao;

import com.fenglingzmb.gulimall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author fenglingzmb
 * @email 3034636631@qq.com
 * @date 2022-06-04 22:14:32
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
