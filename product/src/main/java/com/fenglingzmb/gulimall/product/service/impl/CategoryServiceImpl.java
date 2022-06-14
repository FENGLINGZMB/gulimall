package com.fenglingzmb.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fenglingzmb.common.utils.PageUtils;
import com.fenglingzmb.common.utils.Query;

import com.fenglingzmb.gulimall.product.dao.CategoryDao;
import com.fenglingzmb.gulimall.product.entity.CategoryEntity;
import com.fenglingzmb.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        // 查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);
        // 组装成树形结构
        //筛选出一级分类
        List<CategoryEntity> top = entities.stream().filter((categoryEntity) -> {
            return categoryEntity.getParentCid() == 0;
        }).map(menu->{
            menu.setChildren(getChildren(menu,entities));
            return menu;
        }).sorted((menu1,menu2)->{
            return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
        return top;
    }
    // 查找子菜单
    private List<CategoryEntity> getChildren(CategoryEntity parent,List<CategoryEntity> all){
        return all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == parent.getCatId();
        }).map(categoryEntity -> {
            categoryEntity.setChildren(getChildren(categoryEntity,all));
            return categoryEntity;
        }).sorted((menu1,menu2)->{
            return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
    }

}