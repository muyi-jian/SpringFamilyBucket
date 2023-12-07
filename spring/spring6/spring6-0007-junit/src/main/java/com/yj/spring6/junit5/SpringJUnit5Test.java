package com.yj.spring6.junit5;

import com.yj.spring6.xml.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author YangJian
 * @date 2023/12/3 9:47
 * @description
 */
@SpringJUnitConfig(locations = "classpath:bean.xml")
public class SpringJUnit5Test {

    @Autowired
    private User user;

    @Test
    public void test(){
        System.out.println(user);
    }
}
