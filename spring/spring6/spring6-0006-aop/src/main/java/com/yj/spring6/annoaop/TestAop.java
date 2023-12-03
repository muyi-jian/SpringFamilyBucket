package com.yj.spring6.annoaop;

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
    public void addTest() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-anno.xml");
        Calculator calculator = context.getBean(Calculator.class);
        calculator.add(2,3);
        calculator.mul(4,7);
    }
}
