package com.yj.spring6.example;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YangJian
 * @date 2023/11/30 19:55
 * @description
 */
public class TestCal {

    @Test
    public void addTest(){
        // 调用CalculatorImpl.add
        //Calculator calculator = new CalculatorImpl();
        //calculator.add(1,2);
        //Calculator calculator = new CalculatorLogImpl();
        //calculator.add(1,2);


    }

    @Test
    public void proxyTest(){
        //创建代理对象（动态）
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator)proxyFactory.getProxy();

        //proxy.mul(2,7);
        proxy.add(4,7);
    }

}
