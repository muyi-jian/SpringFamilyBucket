package com.yj.springboot3.config;

import com.yj.springboot3.entity.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

/**
 * @author YangJian
 * @date 2023/12/21 14:29
 * @description
 * `@Import` 注解用于导入其他配置类（也可以是普通类），以便在当前配置类中使用它们定义的配置信息
 *  不使用·@Import(AppConfig.class)· 报错：
 *  Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.yj.springboot3.entity.MyBean' available
 * 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:341)
 * 	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:332)
 * 	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1191)
 * 	at com.yj.springboot3.config.AnotherConfig.main(AnotherConfig.java:19)
 */
@Configuration
@Import(AppConfig.class)
public class AnotherConfig {

    public static void main(String[] args) {
        //1.通过AnnotationConfigApplicationContext创建spring容器，参数为@Import标注的类
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnotherConfig.class);
        MyBean appConfig = applicationContext.getBean(MyBean.class);
        appConfig.test();
    }

}
