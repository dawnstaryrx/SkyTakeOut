package com.sky.controller.admin;

import com.sky.result.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * ClassName: CommonController
 * Package: com.sky.controller.admin
 * Description:  通用接口
 *
 * @Author yrx
 * @Create 2024/4/12 15:09
 * @Version 1.0
 */
@RestController
@RequestMapping("/admin/common")
public class CommonController {

    @PostMapping("/upload")
    public Result<String> upload(MultipartFile file){

        return Result.success("https://cdn.acwing.com/media/user/profile/photo/143940_lg_dad1c68a64.jpg");
    }
}
