package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;

/**
 * ClassName: UserService
 * Package: com.sky.service
 * Description:
 *
 * @Author yrx
 * @Create 2024/4/18 16:26
 * @Version 1.0
 */
public interface UserService {
    User wxLogin(UserLoginDTO userLoginDTO);
}
