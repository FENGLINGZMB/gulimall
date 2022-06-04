package com.fenglingzmb.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fenglingzmb.common.utils.PageUtils;
import com.fenglingzmb.gulimall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author fenglingzmb
 * @email 3034636631@qq.com
 * @date 2022-06-04 19:21:37
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

