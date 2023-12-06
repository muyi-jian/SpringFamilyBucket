package com.yj.spring6.xml;

import com.yj.spring6.xml.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author YangJian
 * @date 2023/12/5 16:52
 * @description
 */
@SpringJUnitConfig(locations = "classpath:bean-xml.xml")
public class JDBCTemplateTest02 {

    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook(){
        bookController.buyBook(1, 1);
    }
}
