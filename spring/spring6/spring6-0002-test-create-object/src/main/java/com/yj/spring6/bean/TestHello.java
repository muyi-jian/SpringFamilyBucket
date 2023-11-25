package com.yj.spring6.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * @author YangJian
 * @date 2023/11/25 20:11
 * @description
 */
public class TestHello {

    @Test
    public void test(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

        Hello hello = (Hello) applicationContext.getBean("hello");
        hello.sayHello();
    }
    @Test
    public void test2() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // dom4j解析beans.xml文件，从中获取class属性值，类的全类名
        // 通过反射机制调用无参数构造方法创建对象
        Class<?> clazz = Class.forName("com.yj.spring6.bean.Hello");
        //Object obj = clazz.newInstance();
        Object obj = clazz.getDeclaredConstructor().newInstance();

        Hello hello = (Hello) obj;
        hello.sayHello();
    }
}
