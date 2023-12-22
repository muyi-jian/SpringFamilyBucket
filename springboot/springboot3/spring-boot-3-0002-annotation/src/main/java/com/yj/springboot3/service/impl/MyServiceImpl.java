package com.yj.springboot3.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author YangJian
 * @date 2023/12/21 16:35
 * @description
 */
@Service
public class MyServiceImpl{

    @Autowired
    private MyService myService;


    public void hello() {
        myService.sayHello();
    }


}
