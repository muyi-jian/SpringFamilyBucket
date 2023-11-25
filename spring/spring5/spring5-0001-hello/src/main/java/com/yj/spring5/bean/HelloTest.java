package com.yj.spring5.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YangJian
 * @date 2023/11/25 20:39
 * @description
 */
public class HelloTest {

    @Test
    public void testHello(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(("bean.xml"));
        Hello hello = (Hello) applicationContext.getBean("hello");
        hello.sayHello();
    }
}
