package com.sky.service;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.entity.Setmeal;
import com.sky.result.PageResult;
import com.sky.vo.DishItemVO;
import com.sky.vo.SetmealVO;

import java.util.List;

/**
 * ClassName: SetmealService
 * Package: com.sky.service
 * Description:
 *
 * @Author yrx
 * @Create 2024/4/13 16:56
 * @Version 1.0
 */
public interface SetmealService {

    PageResult pageQuery(SetmealPageQueryDTO setmealPageQueryDTO);

    void add(SetmealDTO setmealDTO);

    void status(Integer status, Long id);

    SetmealVO searchById(Long id);

    void delete(List<Long> ids);

    /**
     * 条件查询
     * @param setmeal
     * @return
     */
    List<Setmeal> list(Setmeal setmeal);

    /**
     * 根据id查询菜品选项
     * @param id
     * @return
     */
    List<DishItemVO> getDishItemById(Long id);

    void update(SetmealDTO setmealDTO);
}
