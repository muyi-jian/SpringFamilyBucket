package com.yj.spring6.xml.service;

import com.yj.spring6.xml.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    //买书的方法：图书id和用户id
    @Override
    public void buyBook(Integer bookId, Integer userId) {

        //根据图书id查询图书价格
        Integer price = bookDao.getBookPriceByBookId(bookId);

        //更新图书表库存量 -1
        bookDao.updateStock(bookId);

        //更新用户表用户余额 -图书价格
        bookDao.updateUserBalance(userId,price);
    }
}
