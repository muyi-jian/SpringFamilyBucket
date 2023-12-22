package com.yj.springboot3.config;

import com.yj.springboot3.entity.Dog;
import com.yj.springboot3.entity.Dog1;
import com.yj.springboot3.entity.Dog2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author YangJian
 * @date 2023/12/21 14:29
 * @description
 * 使用 `@Configuration` 注解来声明一个 Spring 配置类,
 */
@Configuration
@PropertySource("classpath:dao.properties")
public class DogConfig2 {

    @Bean
    public Dog2 dog2() {
        return new Dog2();
    }

}
