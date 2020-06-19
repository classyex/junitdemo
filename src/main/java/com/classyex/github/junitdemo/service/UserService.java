package com.classyex.github.junitdemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.classyex.github.junitdemo.entity.User;

import java.util.List;

/**
 * UserService.java <br>
 * @version 1.0 <br>
 * @date 2020/6/15 11:49 <br>
 * @author yex <br>
 */
public interface UserService extends IService<User> {

    /**
     * 根据关键字查询用户列表 <br>
     * @version 1.0 <br>
     * @date 2020/6/15 11:49 <br>
     * @author yex <br>
     *
     * @param keyword 用户名称或者邮箱地址，模糊匹配
     * @return java.util.List&lt;com.classyex.github.junitdemo.entity.User&gt;
     */
    List<User> listByKeyword(String keyword);
}
