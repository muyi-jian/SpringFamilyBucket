package com.yj.spring6.xmlaop;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YangJian
 * @date 2023/11/30 19:55
 * @description
 */
public class TestAop {

    @Test
    public void addTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-aop.xml");
        Calculator cal = context.getBean(Calculator.class);
        cal.add(1,2);
    }
}
