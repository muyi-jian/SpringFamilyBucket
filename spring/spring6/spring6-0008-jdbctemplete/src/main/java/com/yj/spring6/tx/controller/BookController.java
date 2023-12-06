package com.yj.spring6.tx.controller;

import com.yj.spring6.tx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author YangJian
 * @date 2023/12/6 13:44
 * @description
 */
@Controller
public class BookController {

    @Autowired
    public BookService bookService;


    public void buyBook(Integer bookId, Integer userId){
        bookService.buyBook(bookId,userId);
    }

}
