package com.fenglingzmb.gulimall.product.dao;

import com.fenglingzmb.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author fenglingzmb
 * @email 3034636631@qq.com
 * @date 2022-06-04 19:21:37
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
