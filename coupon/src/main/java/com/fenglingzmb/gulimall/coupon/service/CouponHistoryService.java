package com.fenglingzmb.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fenglingzmb.common.utils.PageUtils;
import com.fenglingzmb.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author fenglingzmb
 * @email 3034636631@qq.com
 * @date 2022-06-04 22:14:32
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

