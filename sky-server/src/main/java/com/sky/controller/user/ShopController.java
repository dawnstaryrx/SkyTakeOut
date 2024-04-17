package com.sky.controller.user;

import com.sky.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
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
@RestController("userShopController")
@RequestMapping("/user/shop")
public class ShopController {
    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/status")
    public Result<Integer> getStatus(){
        Integer shop_status = (Integer) redisTemplate.opsForValue().get("SHOP_STATUS");
        return Result.success(shop_status);
    }
}
