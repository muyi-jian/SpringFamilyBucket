package com.yj.spring6.test;


import com.yj.spring6.xmlaop.Hello;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YangJian
 * @date 2023/11/25 19:55
 * @description
 */
public class HelloTest {
    /**
     * 1.根据id获取
     */
    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Hello hello = (Hello) applicationContext.getBean("hello");
        hello.sayHello();
    }
    /**
     * 2.根据类型获取
     *  根据类型获取，IOC容器种指定类型的bean只能有一个，
     *  例：配置了：    <bean id="hello2" class="com.yj.spring6.bean.Hello"></bean>
     *  报错：
     *  org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'com.yj.spring6.bean.Hello' available: expected single matching bean but found 2: hello,hello2
     */
    @Test
    public void test02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Hello hello = (Hello) applicationContext.getBean(Hello.class);
        hello.sayHello();
    }
    /**
     * 3.根据id和类型获取
     */
    @Test
    public void test03(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Hello hello = (Hello) applicationContext.getBean("hello",Hello.class);
        hello.sayHello();
    }
}
