package com.yj.spring6.test;

import com.yj.spring6.bean.SpecialVal;
import com.yj.spring6.bean.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YangJian
 * @date 2023/11/25 21:42
 * @description
 */
public class SpecialValTest {

    /**
     *
     * setter注入
     */
    @Test
    public void testDIBySet(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-spec.xml");
        SpecialVal specialVal = applicationContext.getBean("specialVal", SpecialVal.class);
        System.out.println(specialVal);
    }

    /**
     *
     * null值
     */
    @Test
    public void testNull(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-spec.xml");
        SpecialVal specialVal = applicationContext.getBean("specialValOne", SpecialVal.class);
        System.out.println(specialVal);
    }

    /**
     *
     * xml实体
     */
    @Test
    public void testXmlEntity(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-spec.xml");
        SpecialVal specialVal = applicationContext.getBean("specialValTwo", SpecialVal.class);
        System.out.println(specialVal);
    }
    /**
     *
     * xml实体
     */
    @Test
    public void testCDATA(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-spec.xml");
        SpecialVal specialVal = applicationContext.getBean("specialValThree", SpecialVal.class);
        System.out.println(specialVal);
    }
}
