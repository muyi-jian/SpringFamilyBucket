package com.yj.springboot3.service.impl;

import org.springframework.stereotype.Component;

/**
 * @author YangJian
 * @date 2023/12/21 16:34
 * @description
 * `@Component` 是 Spring 框架中的一个注解，它表示当前标注的类是一个组件类，需要被 Spring 管理。
 * 通常情况下，我们使用 `@Component` 注解来声明一个普通的 bean，这个 bean 可以在整个应用程序中被其他组件引用和使用。
 */
@Component
public class MyService {
    public void sayHello() {
        System.out.println("Hello, Component!");
    }
}
