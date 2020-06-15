package com.classyex.github.junitdemo.dao;

import com.classyex.github.junitdemo.entity.User;

import java.util.List;

/**
 * @author yex <br>
 * @version 1.0 <br>
 * @date 2020/6/15 12:28 <br>
 */
public interface UserDao {

    /**
     * 按年龄排序 <br>
     * @version 1.0 <br>
     * @date 2020/6/15 14:57 <br>
     * @author yex <br>
     *
     * @param
     * @return java.util.List<com.classyex.github.junitdemo.entity.User>
     */
    List<User> listUserAgeRank();

}
