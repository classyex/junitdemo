package com.classyex.github.junitdemo.service.impl;


import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.classyex.github.junitdemo.entity.User;
import com.classyex.github.junitdemo.mapper.UserMapper;
import com.classyex.github.junitdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserServiceImpl.java <br>
 * @version 1.0 <br>
 * @date 2020/6/15 11:49 <br>
 * @author yex <br>
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


    @Override
    public List<User> listByKeyword(String keyword) {
        List<User> list = list(Wrappers.lambdaQuery(User.class)
                .like(User::getName, keyword).or().like(User::getEmail, keyword));
        return list;
    }
}
