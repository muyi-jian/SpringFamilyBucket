package com.yj.spring6.test;

import com.yj.spring6.xmlaop.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YangJian
 * @date 2023/11/25 21:42
 * @description
 */
public class StudentClazzTest {

    /**
     *
     * 依赖注入之setter注入
     */
    @Test
    public void testBeanRef(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-stu-clazz.xml");
        Student studentOne = applicationContext.getBean("studentOne", Student.class);
        System.out.println(studentOne);
    }


    @Test
    public void testBeanInner(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-stu-clazz.xml");
        Student studentTwo = applicationContext.getBean("studentTwo", Student.class);
        System.out.println(studentTwo);
    }

    @Test
    public void testBeanCascade(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-stu-clazz.xml");
        Student studentThree = applicationContext.getBean("studentThree", Student.class);
        System.out.println(studentThree);
    }


}
