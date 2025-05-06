package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
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

    /***
     *查询口味数据
     * @param dishId
     * @return
     */
    @Select("select * from dish_flavor where dish_id = #{dishId}" )
    ArrayList<DishFlavor> getByDishId(Long dishId);


    /***
     * 根据id删除口味数据
     * @param id
     */
    @Delete("delete from dish_flavor where dish_id = #{id}")
    void deleteFlavorByDishId(Long id);
}
