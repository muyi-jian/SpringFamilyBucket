package com.yj.springboot3.service;

import com.yj.springboot3.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author YangJian
 * @date 2023/12/21 14:45
 * @description
 */

public interface UserService {
    User getUserById(Long id);
}
