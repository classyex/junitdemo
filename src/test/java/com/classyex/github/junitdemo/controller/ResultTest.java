package com.classyex.github.junitdemo.controller;

import com.classyex.github.junitdemo.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.classyex.github.junitdemo.controller.Result.SUCCESS_CODE;
import static com.classyex.github.junitdemo.controller.Result.SUCCESS_MSG;

/**
 * @author yex <br>
 * @version 1.0 <br>
 * @date 2020/6/15 15:52 <br>
 */
public class ResultTest {

    @Test
    public void should_get_string_data() {
        Result<String> result = new Result<>("ok");
        Assertions.assertEquals(SUCCESS_CODE, result.getCode());
        Assertions.assertEquals(SUCCESS_MSG, result.getMsg());
        Assertions.assertEquals("ok", result.getData());
    }

    @Test
    public void should_get_object_data() {
        User user = new User();
        user.setId(1L);
        Result<User> result = new Result<>(user);
        Assertions.assertEquals(SUCCESS_CODE, result.getCode());
        Assertions.assertEquals(SUCCESS_MSG, result.getMsg());
        Assertions.assertEquals(1L, result.getData().getId());
    }

    @Test
    public void should_get_message() {
        Result<Object> msg = new Result<>(1, "msg");
        Assertions.assertEquals(1, msg.getCode());
        Assertions.assertEquals("msg", msg.getMsg());
    }

    @Test
    public void should_get_message_and_data() {
        Result<String> result = new Result<>(1, "msg", "data");
        Assertions.assertEquals(1, result.getCode());
        Assertions.assertEquals("msg", result.getMsg());
        Assertions.assertEquals("data", result.getData());
    }

    @Test
    public void should_get_error_message() {
        Result error = Result.error(-1, "error");
        Assertions.assertEquals(-1, error.getCode());
        Assertions.assertEquals("error", error.getMsg());
    }

    @Test
    public void should_get_ok() {
        Result ok = Result.ok();
        Assertions.assertEquals(SUCCESS_CODE, ok.getCode());
        Assertions.assertEquals(SUCCESS_MSG, ok.getMsg());
    }

    @Test
    public void should_get_ok_with_data() {
        Result result = Result.ok("data");
        Assertions.assertEquals(SUCCESS_CODE, result.getCode());
        Assertions.assertEquals(SUCCESS_MSG, result.getMsg());
        Assertions.assertEquals("data", result.getData());
    }

    @Test
    public void should_get_with_empty() {
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        result.setMsg(SUCCESS_MSG);
        result.setData("data");
        Assertions.assertEquals(SUCCESS_CODE, result.getCode());
        Assertions.assertEquals(SUCCESS_MSG, result.getMsg());
        Assertions.assertEquals("data", result.getData());
    }

}
