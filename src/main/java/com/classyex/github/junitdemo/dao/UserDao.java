package com.classyex.github.junitdemo.dao;

import com.classyex.github.junitdemo.entity.User;

import java.util.List;

/**
 * 用户接口
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
     * @return java.util.List&lt;com.classyex.github.junitdemo.entity.User&gt;
     */
    List<User> listUserAgeRank();

}
