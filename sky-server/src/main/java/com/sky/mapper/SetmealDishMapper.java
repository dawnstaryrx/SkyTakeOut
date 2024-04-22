package com.sky.mapper;

import com.sky.entity.Setmeal;
import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * ClassName: SetmealDishMapper
 * Package: com.sky.mapper
 * Description:
 *
 * @Author yrx
 * @Create 2024/4/13 16:07
 * @Version 1.0
 */
@Mapper
public interface SetmealDishMapper {


    List<Long> getSetmealIdByDishIds(List<Long> dishIds);

    List<Long> getDishIdBySetmealIds(List<Long> setmealIds);

    void insertBatch(List<SetmealDish> setmealDishes);
    @Select("select * from setmeal_dish where setmeal_id = #{id}")
    List<SetmealDish> getById(Long id);
    @Delete("delete from setmeal_dish where setmeal_id = #{setmealId}")
    void deleteBySetmealId(Long setmealId);
}
