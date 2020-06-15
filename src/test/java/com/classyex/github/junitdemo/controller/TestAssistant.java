package com.classyex.github.junitdemo.controller;

import org.springframework.test.web.servlet.ResultActions;

import static com.classyex.github.junitdemo.controller.Result.SUCCESS_CODE;
import static com.classyex.github.junitdemo.controller.Result.SUCCESS_MSG;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * 测试工具类
 * @author yex
 * @date 2019/10/28 9:55
 */
public class TestAssistant {

    /**
     * 断言服务调用成功
     * @param resultActions
     * @return
     * @throws Exception
     */
    public static ResultActions assertSuccess(ResultActions resultActions) throws Exception {
        return resultActions.andExpect(status().isOk())
                .andExpect(jsonPath("$.code").value(SUCCESS_CODE))
                .andExpect(jsonPath("$.msg").value(SUCCESS_MSG));
    }

}
