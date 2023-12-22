package com.yj.springboot3.service.impl;

import com.yj.springboot3.dao.UserDao;
import com.yj.springboot3.entity.User;
import com.yj.springboot3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author YangJian
 * @date 2023/12/21 14:45
 * @description
 * `@Service`：用于标记服务类，表示这是一个业务逻辑层组件。服务类通常包含一些业务方法，用于处理业务逻辑。
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }
}
