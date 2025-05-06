package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

public interface DishService {
    //新增菜品
    void addDishWithFlavor(DishDTO dishDTO);

    //菜品分页查询
    PageResult page(DishPageQueryDTO dishPageQueryDTO);

    //删除菜品
    void delete(String ids);

    //根据id查询菜品和关联的口味数据
    DishVO getByIdWithFlavor(Long id);

    //修改菜品
    void updateWithFlavor(DishDTO dishDTO);
}
