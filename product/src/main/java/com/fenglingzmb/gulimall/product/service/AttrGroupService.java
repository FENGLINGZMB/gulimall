package com.fenglingzmb.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fenglingzmb.common.utils.PageUtils;
import com.fenglingzmb.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author fenglingzmb
 * @email 3034636631@qq.com
 * @date 2022-06-04 19:21:38
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

