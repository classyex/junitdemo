package com.classyex.github.junitdemo.mapper;

import com.classyex.github.junitdemo.base.BaseMapperH2Test;
import com.classyex.github.junitdemo.dao.UserDao;
import com.classyex.github.junitdemo.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author yex <br>
 * @version 1.0 <br>
 * @date 2020/6/15 14:05 <br>
 */
public class UserDaoTest extends BaseMapperH2Test {

    @Autowired
    private UserDao userDao;

    @Test
    public void should_list_user_age_rank() {
        List<User> list = userDao.listUserAgeRank();
        Assertions.assertEquals(4, list.get(2).getId());
        Assertions.assertEquals(3, list.get(4).getId());
    }

}
