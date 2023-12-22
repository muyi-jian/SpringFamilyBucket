package com.yj.springboot3.config;

import com.yj.springboot3.entity.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author YangJian
 * @date 2023/12/21 14:29
 * @description
 * 使用 `@ComponentScan` 注解配置 Spring 组件的扫描范围，
 * 指定了 `com.yj.springboot3.service` 和 `com.yj.springboot3.dao` 两个包及其子包中的组件都会被扫描到并注册为 Bean
 */
@Configuration
@ComponentScan(basePackages = {"com.yj.springboot3.service", "com.yj.springboot3.dao"})
public class AppConfigOne {
}
