package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DishFlavorMapper {


    /**
     * 批量插入口味数据
     * @param dishFlavor
     */
    void addFlavor(List<DishFlavor> dishFlavor);


    /**
     * 删除口味数据
     * @param ids
     */
    void deleteFlavor(String[] ids);
}
