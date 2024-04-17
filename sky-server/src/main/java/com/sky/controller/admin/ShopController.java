package com.sky.controller.admin;

import com.sky.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: ShopController
 * Package: com.sky.controller.admin
 * Description:
 *
 * @Author yrx
 * @Create 2024/4/16 16:07
 * @Version 1.0
 */
@RestController("adminShopController")
@RequestMapping("/admin/shop")
public class ShopController {
    @Autowired
    private RedisTemplate redisTemplate;

    @PutMapping("/{status}")
    public Result setStatus(@PathVariable Integer status){
        redisTemplate.opsForValue().set("SHOP_STATUS", status);
        return Result.success();
    }

    @GetMapping("/status")
    public Result<Integer> getStatus(){
        Integer shop_status = (Integer) redisTemplate.opsForValue().get("SHOP_STATUS");
        return Result.success(shop_status);
    }
}
