package com.yj.spring6.test;

import com.yj.spring6.xmlaop.P;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YangJian
 * @date 2023/11/28 21:03
 * @description
 */
public class TestP {

    @Test
    public void test_p() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-p.xml");
        P p = applicationContext.getBean("p", P.class);
        System.out.println(p);
    }
}
