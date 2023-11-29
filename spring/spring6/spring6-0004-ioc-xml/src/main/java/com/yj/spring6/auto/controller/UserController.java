package com.yj.spring6.auto.controller;


import com.yj.spring6.auto.service.UserService;

public class UserController {

    private UserService userService;
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser() {
        System.out.println("controller方法执行了...");
        //调用service的方法
        userService.addUserService();
    }
}
