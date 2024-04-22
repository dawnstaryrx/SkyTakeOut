package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;

/**
 * ClassName: DishService
 * Package: com.sky.service
 * Description:
 *
 * @Author yrx
 * @Create 2024/4/10 15:45
 * @Version 1.0
 */
public interface DishService {
    void updateStatus(Integer status, Long id);

    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    void add(DishDTO dishDTO);

    DishVO searchById(Long id);

    void update(DishDTO dishDTO);

    List<Dish> searchByCategoryId(Long cateogryId);

    void delete(List<Long> ids);

    /**
     * 条件查询菜品和口味
     * @param dish
     * @return
     */
    List<DishVO> listWithFlavor(Dish dish);
}
