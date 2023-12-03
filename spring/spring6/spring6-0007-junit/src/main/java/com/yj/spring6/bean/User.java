package com.yj.spring6.bean;

import org.springframework.stereotype.Component;

/**
 * @author YangJian
 * @date 2023/12/3 9:45
 * @description
 */
@Component
public class User {
    public User() {
        System.out.println( "User 构造方法");
    }
}
