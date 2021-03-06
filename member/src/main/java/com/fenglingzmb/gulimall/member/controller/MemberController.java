package com.fenglingzmb.gulimall.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.fenglingzmb.gulimall.member.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fenglingzmb.gulimall.member.entity.MemberEntity;
import com.fenglingzmb.gulimall.member.service.MemberService;
import com.fenglingzmb.common.utils.PageUtils;
import com.fenglingzmb.common.utils.R;



/**
 * 会员
 *
 * @author fenglingzmb
 * @email 3034636631@qq.com
 * @date 2022-06-04 22:24:37
 */
@RestController
@RequestMapping("member/{member}")
public class MemberController {
    @Autowired
    private MemberService memberService;

    /**
     * 测试远程调用 coupon 服务获取所有优惠券
     */
    @Autowired
    CouponFeignService couponFeignService;

    @RequestMapping("/coupons")
    public R testCoupon(@PathVariable("member") String member){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("fenglingzmb");
        R memberCoupons = couponFeignService.memberCoupons(member);
        return R.ok().put("member", memberEntity).put("coupons", memberCoupons.get("coupons"));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
