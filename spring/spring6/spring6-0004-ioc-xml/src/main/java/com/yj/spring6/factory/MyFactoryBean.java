package com.yj.spring6.factory;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author YangJian
 * @date 2023/11/29 21:46
 * @description
 */
public class MyFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}