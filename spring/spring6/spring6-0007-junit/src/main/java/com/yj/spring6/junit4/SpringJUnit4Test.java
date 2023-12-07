package com.yj.spring6.junit4;

import com.yj.spring6.xml.bean.User;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.Test;
/**
 * @author YangJian
 * @date 2023/12/3 9:47
 * @description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean.xml")
public class SpringJUnit4Test {

    @Autowired
    private User user;

    @Test
    public void test(){
        System.out.println(user);
    }
}
