package com.classyex.github.junitdemo.service;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.classyex.github.junitdemo.base.BaseServiceTest;
import com.classyex.github.junitdemo.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

/**
 * @author yex <br>
 * @version 1.0 <br>
 * @date 2020/6/12 17:15 <br>
 */
public class UserServiceTest extends BaseServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void should_get_user_by_id() {
        User oneUser = userService.getById(1);
        Assertions.assertEquals("Jone", oneUser.getName());
        User another = userService.getById(2);
        Assertions.assertEquals("Jack", another.getName());
    }

    @Test
    public void should_add_a_user() {
        User user = new User();
        String name = "zhangs";
        user.setName(name);
        boolean save = userService.save(user);
        Assertions.assertTrue(save);
        User one = userService.getOne(Wrappers.lambdaQuery(User.class).eq(User::getName, name));
        Assertions.assertEquals(name, one.getName());
    }

    @Test
    public void should_modifer_user_by_id() {
        User user = new User();
        long id = 1L;
        user.setId(id);
        String name = "zhangs";
        user.setName(name);
        boolean update = userService.updateById(user);
        Assertions.assertTrue(update);
        User byId = userService.getById(id);
        Assertions.assertEquals(name, byId.getName());
    }

    @Test
    public void should_delete_user_by_id() {
        long id = 1L;
        boolean remove = userService.removeById(id);
        Assertions.assertTrue(remove);
        User byId = userService.getById(id);
        Assertions.assertNull(byId);
    }

    @Test
    public void should_list_by_keyword_use_mail() {
        List<User> list = userService.listByKeyword("@");
        Assertions.assertEquals(5, list.size());
    }

    @Test
    public void should_list_by_keyword_use_name() {
        List<User> list = userService.listByKeyword("J");
        Assertions.assertEquals(2, list.size());
    }


}
