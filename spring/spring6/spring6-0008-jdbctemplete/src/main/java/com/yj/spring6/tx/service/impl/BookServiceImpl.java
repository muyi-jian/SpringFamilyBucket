package com.yj.spring6.tx.service.impl;

import com.yj.spring6.tx.dao.BookDao;
import com.yj.spring6.tx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author YangJian
 * @date 2023/12/6 13:45
 * @description
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    public BookDao bookDao;

    /**
     *
     *可以通过@Transactional中相关属性设置回滚策略
     *
     * - rollbackFor属性：需要设置一个Class类型的对象
     * - rollbackForClassName属性：需要设置一个字符串类型的全类名
     * - noRollbackFor属性：需要设置一个Class类型的对象
     * - rollbackFor属性：需要设置一个字符串类型的全类名
     */
    @Override
    @Transactional
    //@Transactional(readOnly = true)//不涉及读写
    //@Transactional(timeout = 3) // 超时 单位秒
    public void buyBook(Integer bookId, Integer userId) {
        //try {
        //    TimeUnit.SECONDS.sleep(5);
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}
        //查询图书的价格
        Integer price = bookDao.getPriceByBookId(bookId);
        //更新图书的库存
        bookDao.updateStock(bookId);
        //更新用户的余额
        bookDao.updateBalance(userId, price);
        //System.out.println(1/0);

    }
}
