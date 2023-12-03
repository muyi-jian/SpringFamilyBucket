package com.yj.spring6.life;

import com.yj.spring6.xmlaop.Life;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author YangJian
 * @date 2023/11/29 21:16
 * @description
 */
public class TestLife {

    @Test
    public void ifeTest(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean-life.xml");
        Life life = ac.getBean(Life.class);
        System.out.println("生命周期：4、通过IOC容器获取bean并使用");
        ac.close();
    }
}
