package com.yj.springboot3.dao;

import com.yj.springboot3.entity.User;

/**
 * @author YangJian
 * @date 2023/12/21 14:46
 * @description
 */
public interface UserDao {
    User getUserById(Long id);
}
