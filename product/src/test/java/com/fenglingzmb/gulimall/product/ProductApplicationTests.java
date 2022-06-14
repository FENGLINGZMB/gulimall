package com.fenglingzmb.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fenglingzmb.gulimall.product.entity.BrandEntity;
import com.fenglingzmb.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProductApplicationTests {

	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setName("huawei");
//		brandEntity.setBrandId(1L);
		brandService.save(brandEntity);
//		System.out.println("save success ...");
//		brandService.updateById(brandEntity);
		List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("name", "huawei"));
		list.forEach(item->{
			System.out.println(item);
		});

	}

}
