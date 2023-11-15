package com.yj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * @author YangJian
 * @date 2023/11/15 13:44
 * @description
 */
public class TestMain {

    @Test
    public void testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Hello h = context.getBean("hello", Hello.class);
        System.out.println(h);
        h.sayHello();

    }
}
