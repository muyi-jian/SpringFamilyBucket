package com.yj.spring6.test;

import com.yj.spring6.xmlaop.SpecialType;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YangJian
 * @date 2023/11/25 21:42
 * @description
 */
public class SpecialTypeTest {

    /**
     *
     * 数组类型
     */
    @Test
    public void testArray(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-st.xml");
        SpecialType specialArray = applicationContext.getBean("specialArray", SpecialType.class);
        specialArray.show();
    }

    @Test
    public void testList(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-st.xml");
        SpecialType specialList = applicationContext.getBean("specialList", SpecialType.class);
        System.out.println(specialList);

    }
    // map类型
    @Test
    public void testMap(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-st.xml");
        SpecialType specialMap = applicationContext.getBean("specialMap", SpecialType.class);
        System.out.println(specialMap);

    }@Test
    public void testMapOne(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-util.xml");
        SpecialType specialMapOne = applicationContext.getBean("specialMapOne", SpecialType.class);
        System.out.println(specialMapOne);

    }



}
