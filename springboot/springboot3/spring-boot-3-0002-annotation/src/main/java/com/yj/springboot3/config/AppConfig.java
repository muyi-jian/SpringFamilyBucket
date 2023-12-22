package com.yj.springboot3.config;

import com.yj.springboot3.entity.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author YangJian
 * @date 2023/12/21 14:29
 * @description
 * 使用 `@Configuration` 注解来声明一个 Spring 配置类,
 */
@Configuration
public class AppConfig {
    /**
     *   `@Bean` 使用 `@Bean` 注解来创建名为 `myBean` 的 Bean 对象
     * 这个 Bean 会被 Spring 容器托管管理，可以在其它组件中使用
     *  `@Scope("prototype")` 指定它的作用域为 `prototype`，表示每次获取该 Bean 时都会创建一个新的实例对象
     */
    @Bean
    @Scope("prototype")
    public MyBean myBean() {
        return new MyBean();
    }
}
