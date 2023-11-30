package com.yj.spring6.resource;

import com.yj.spring6.config.SpringConfig;
import com.yj.spring6.resource.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserControllerAnno {

    public static void main(String[] args) {
        //加载配置类
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController controller = context.getBean(UserController.class);
        controller.add();
    }
}
