package com.classyex.github.junitdemo.service.impl;

import com.classyex.github.junitdemo.dao.UserDao;
import com.classyex.github.junitdemo.entity.User;
import com.classyex.github.junitdemo.service.UserRankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yex <br>
 * @version 1.0 <br>
 * @date 2020/6/15 15:01 <br>
 */
@Service
public class UserRankServiceImpl implements UserRankService {

    @Autowired
    private UserDao userDao;

    @Override
    public int getUserAgeRank(long id) {
        List<User> list = userDao.listUserAgeRank();
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()) {
                return i + 1;
            }
        }
        return Integer.MAX_VALUE;
    }
}
