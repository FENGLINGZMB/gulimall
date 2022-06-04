package com.fenglingzmb.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fenglingzmb.common.utils.PageUtils;
import com.fenglingzmb.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author fenglingzmb
 * @email 3034636631@qq.com
 * @date 2022-06-04 22:38:45
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

