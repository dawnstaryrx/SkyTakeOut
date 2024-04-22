package com.sky.controller.admin;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.result.Result;
import com.sky.service.SetmealService;
import com.sky.vo.SetmealVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

/**
 * ClassName: SetmealController
 * Package: com.sky.controller.admin
 * Description:
 *
 * @Author yrx
 * @Create 2024/4/13 16:55
 * @Version 1.0
 */
@RestController
@RequestMapping("/admin/setmeal")
public class SetmealController {
    @Autowired
    private SetmealService setmealService;

    @GetMapping("/page")
    public Result<PageResult> page(SetmealPageQueryDTO setmealPageQueryDTO){
        PageResult pageResult = setmealService.pageQuery(setmealPageQueryDTO);
        return Result.success(pageResult);
    }

    @PostMapping
    public Result add(@RequestBody SetmealDTO setmealDTO){
        setmealService.add(setmealDTO);
        return Result.success();
    }

    @PostMapping("/status/{status}")
    public Result status(@PathVariable Integer status, Long id){
        setmealService.status(status, id);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result<SetmealVO> searchById(@PathVariable Long id){
        SetmealVO setmealVO = setmealService.searchById(id);
        return Result.success(setmealVO);
    }

    @DeleteMapping
    public Result delete(@RequestParam List<Long> ids){
        setmealService.delete(ids);
        return Result.success();
    }

    @PutMapping
    @ApiOperation("修改套餐")
    public Result update(@RequestBody SetmealDTO setmealDTO) {
        setmealService.update(setmealDTO);
        return Result.success();
    }
}
