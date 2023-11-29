package com.yj.spring6.auto.service;


import com.yj.spring6.auto.dao.UserDao;

public class UserServiceImpl  implements UserService{

    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUserService() {
        System.out.println("userService方法执行了...");
        userDao.addUserDao();
    }
}
