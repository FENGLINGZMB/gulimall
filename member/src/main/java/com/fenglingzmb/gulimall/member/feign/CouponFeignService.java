package com.fenglingzmb.gulimall.member.feign;

import com.fenglingzmb.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author fenglingzmb
 * @date 2022/6/5
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/{member}/list")
    public R memberCoupons(@PathVariable("member") String member);
}
