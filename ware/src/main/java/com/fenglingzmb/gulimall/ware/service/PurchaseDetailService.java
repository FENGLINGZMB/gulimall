package com.fenglingzmb.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fenglingzmb.common.utils.PageUtils;
import com.fenglingzmb.gulimall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author fenglingzmb
 * @email 3034636631@qq.com
 * @date 2022-06-04 22:38:47
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

