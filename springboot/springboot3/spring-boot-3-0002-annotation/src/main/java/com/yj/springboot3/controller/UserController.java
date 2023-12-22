package com.yj.springboot3.controller;

import com.yj.springboot3.entity.User;
import com.yj.springboot3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author YangJian
 * @date 2023/12/21 14:51
 * @description
 * `@Controller`：用于标记控制器类，表示这是一个处理用户请求的类。在 Spring MVC 中，控制器负责处理用户的请求并返回响应。
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    @ResponseBody
    public User getUserById(@PathVariable("id") Long id){
        return userService.getUserById(id);
    }
}
