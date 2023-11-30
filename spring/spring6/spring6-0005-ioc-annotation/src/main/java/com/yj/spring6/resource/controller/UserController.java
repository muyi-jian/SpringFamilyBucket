package com.yj.spring6.resource.controller;

import com.yj.spring6.resource.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

@Controller("myUserController")
public class UserController {

    //根据名称进行注入
//    @Resource(name = "myUserService")
//    private UserService userService;

    //根据类型配置
    @Resource
    private UserService userService;

    public void add() {
        System.out.println("controller........");
        userService.add();
    }
}
