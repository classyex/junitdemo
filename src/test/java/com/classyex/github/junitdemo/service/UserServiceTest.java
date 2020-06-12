package com.classyex.github.junitdemo.service;

import com.classyex.github.junitdemo.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author yex <br>
 * @version 1.0 <br>
 * @date 2020/6/12 17:15 <br>
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void should_get_user_by_id() {
        User oneUser = userService.getById(1);
        assertUser(oneUser, 1, 18, "Jone", "test1@baomidou.com");
        User another = userService.getById(2);
        assertUser(another, 2, 20, "Jack", "test2@baomidou.com");
    }

    private void assertUser(User byId, int id, int age, String name, String email) {
        Assertions.assertEquals(id, byId.getId());
        Assertions.assertEquals(age, byId.getAge());
        Assertions.assertEquals(name, byId.getName());
        Assertions.assertEquals(email, byId.getEmail());
    }

}
