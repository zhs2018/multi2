package com.hais.service.impl;

import com.hais.service.UserService;
import com.modules.dao.UserMapper;
import com.modules.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * multi2-com.hais.service.impl
 *
 * @Description:
 * @Author: ZhangHaiSheng
 * @Date: 2018-05-11 12:01
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> queryAll() {
        return userMapper.selectAll();
    }
}
