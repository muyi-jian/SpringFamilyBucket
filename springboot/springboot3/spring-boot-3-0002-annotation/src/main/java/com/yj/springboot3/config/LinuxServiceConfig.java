package com.yj.springboot3.config;

import com.yj.springboot3.condition.LinuxCondition;
import com.yj.springboot3.entity.MyBean;
import com.yj.springboot3.service.impl.LinuxService;
import com.yj.springboot3.service.impl.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author YangJian
 * @date 2023/12/22 10:48
 * @description
 * ` @Conditional(LinuxCondition.class)` 先创建一个LinuxCondition类实现Condition，根据需要编写条件，根据条件判断返回true和false，只有符合条件的才会被Spring容器处理和注册
 */

@Configuration
//@Conditional(LinuxCondition.class)
public class LinuxServiceConfig {

    @Bean
    @Conditional(LinuxCondition.class)
    public LinuxService linuxService() {
        return new LinuxService();
    }

    public static void main(String[] args) {
        //1.通过AnnotationConfigApplicationContext创建spring容器，参数为@Import标注的类
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(LinuxServiceConfig.class);
        LinuxService appConfig = applicationContext.getBean(LinuxService.class);
        appConfig.test();
    }
}
