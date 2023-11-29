package com.yj.spring6.factory;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YangJian
 * @date 2023/11/29 21:52
 * @description
 */
public class UserFactoryBeanTest {
    @Test
    public void testUserFactoryBean(){
        //获取IOC容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean-factorybean.xml");
        User user = (User) ac.getBean("user");
        System.out.println(user);
    }
}
