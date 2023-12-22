package com.yj.springboot3.config;

import com.yj.springboot3.entity.Dog;
import com.yj.springboot3.entity.Dog1;
import com.yj.springboot3.entity.Dog2;
import com.yj.springboot3.entity.MyBean;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

/**
 * @author YangJian
 * @date 2023/12/21 14:29
 * @description
 * 使用 `@Configuration` 注解来声明一个 Spring 配置类,
 */
@Configuration
public class DogConfig {
    /**
     * `@Bean` 使用 `@Bean` 注解来创建名为 `myBean` 的 Bean 对象
     * 这个 Bean 会被 Spring 容器托管管理，可以在其它组件中使用
     * `@Scope("prototype")` 指定它的作用域为 `prototype`，表示每次获取该 Bean 时都会创建一个新的实例对象
     */
    @Bean
    public Dog dog() {
        return new Dog();
    }

    @Bean
    public Dog1 dog1() {
        return new Dog1();
    }


}
