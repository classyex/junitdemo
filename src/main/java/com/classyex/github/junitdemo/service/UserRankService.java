package com.classyex.github.junitdemo.service;

/**
 * 用户年龄排行接口
 * @author yex <br>
 * @version 1.0 <br>
 * @date 2020/6/15 15:01 <br>
 */
public interface UserRankService {

    /**
     * 获取用户年龄排行 <br>
     * @version 1.0 <br>
     * @date 2020/6/15 15:03 <br>
     * @author yex <br>
     *
     * @param id 用户id
     * @return int 排行第几，从1开始
     */
    int getUserAgeRank(long id);
}
