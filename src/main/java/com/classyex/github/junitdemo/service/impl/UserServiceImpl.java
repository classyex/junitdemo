package com.classyex.github.junitdemo.service.impl;


import com.classyex.github.junitdemo.mapper.UserMapper;
import com.classyex.github.junitdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

}
