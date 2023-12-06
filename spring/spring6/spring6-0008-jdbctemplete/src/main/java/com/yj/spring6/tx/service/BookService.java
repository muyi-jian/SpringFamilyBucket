package com.yj.spring6.tx.service;

/**
 * @author YangJian
 * @date 2023/12/6 13:45
 * @description
 */
public interface BookService {
    void buyBook(Integer bookId, Integer userId);
}
