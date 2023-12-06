package com.yj.spring6.tx.dao;

/**
 * @author YangJian
 * @date 2023/12/6 13:46
 * @description
 */
public interface BookDao {
    Integer getPriceByBookId(Integer bookId);

    void updateStock(Integer bookId);

    void updateBalance(Integer userId, Integer price);
}
