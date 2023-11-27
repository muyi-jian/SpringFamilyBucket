package com.yj.spring6.test;

import com.yj.spring6.bean.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YangJian
 * @date 2023/11/25 21:42
 * @description
 */
public class StudentTest {

    /**
     *
     * 依赖注入之setter注入
     */
    @Test
    public void testDIBySet(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-stu.xml");
        Student studentOne = applicationContext.getBean("studentOne", Student.class);
        System.out.println(studentOne);
    }

    /**
     *
     * 依赖注入之构造器注入
     *
     */
    @Test
    public void testDIByContructor(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-stu.xml");
        Student studentTwo = applicationContext.getBean("studentTwo", Student.class);
        System.out.println(studentTwo);
    }


}
