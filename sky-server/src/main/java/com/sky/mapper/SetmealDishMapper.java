package com.sky.mapper;

import com.sky.entity.Setmeal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.*;

@Mapper
public interface SetmealDishMapper {

    List<Long> getSetmealIdsByDishIds(String[] dishIds);

}
