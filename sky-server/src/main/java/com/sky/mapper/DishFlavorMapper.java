package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * ClassName: DishFlavorMapper
 * Package: com.sky.mapper
 * Description:
 *
 * @Author yrx
 * @Create 2024/4/12 16:13
 * @Version 1.0
 */
@Mapper
public interface DishFlavorMapper {

    void insertBatch(List<DishFlavor> flavors);

    @Select("select * from  dish_flavor where dish_id = #{id} ")
    List<DishFlavor> getById(Long id);


    @Delete("delete from dish_flavor where dish_id = #{id}")
    void deleteByDishId(Long id);
}
