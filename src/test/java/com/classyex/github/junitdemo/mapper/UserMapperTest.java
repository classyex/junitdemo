package com.classyex.github.junitdemo.mapper;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.classyex.github.junitdemo.base.BaseMapperH2Test;
import com.classyex.github.junitdemo.base.BaseMapperTest;
import com.classyex.github.junitdemo.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author yex <br>
 * @version 1.0 <br>
 * @date 2020/6/12 16:45 <br>
 */
public class UserMapperTest extends BaseMapperH2Test {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void should_get_all_user() {
        List<User> userList = userMapper.selectList(null);
        Assertions.assertEquals(5, userList.size());
    }

    @Test
    public void should_add_a_user() {
        User user = new User();
        user.setAge(11);
        user.setEmail("11@test.com");
        String name = "xiaohua";
        user.setName(name);
        int insert = userMapper.insert(user);
        Assertions.assertEquals(1, insert);
        User xiaohua = userMapper.selectOne(Wrappers.lambdaQuery(User.class).eq(User::getName, name));
        Assertions.assertEquals(name, xiaohua.getName());
    }

    @Test
    public void should_modifer_user_by_id() {
        User user = new User();
        long id = 1L;
        user.setId(id);
        String email = "11@test.com";
        user.setEmail(email);
        int update = userMapper.updateById(user);
        Assertions.assertEquals(1, update);
        User result = userMapper.selectById(id);
        Assertions.assertEquals(email, result.getEmail());
    }

    @Test
    public void should_delete_user_by_id() {
        long id = 1L;
        int delete = userMapper.deleteById(id);
        Assertions.assertEquals(1, delete);
        User result = userMapper.selectById(id);
        Assertions.assertNull(result);
    }

}
