package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;

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
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    void add(DishDTO dishDTO);
}
