package com.oracle.service.impl;

import com.oracle.mapper.UserMapper;
import com.oracle.pojo.User;
import com.oracle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(String userName, String password) {
        return userMapper.selectUserByUserNameAndPassword(userName,password);
    }
}
