package com.yj.springboot3.dao.impl;

import com.yj.springboot3.dao.UserDao;
import com.yj.springboot3.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author YangJian
 * @date 2023/12/21 14:46
 * @description
 * `@Repository`：用于标记数据访问层组件。仓库类通常包含一些数据访问方法，用于与数据库进行交互。
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public User getUserById(Long id) {
        return new User(1L,"ZHANGSAN",23);
    }
}
