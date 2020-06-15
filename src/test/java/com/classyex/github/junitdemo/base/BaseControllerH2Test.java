package com.classyex.github.junitdemo.base;

import cn.hutool.json.JSONUtil;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import static org.springframework.http.MediaType.APPLICATION_JSON;

/**
 * 控制器测试基类，连接h2数据库
 * @author yex
 * @date 2019/10/22 16:39
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("dev")
@Disabled
public class BaseControllerH2Test {

    protected static final String ADMIN_TOKEN = "11111111111111111111111111111111";
    protected static final String USER_TOKEN = "11111111111111111111111111111112";

    @Autowired
    protected MockMvc mockMvc;

    public ResultActions performWithJson(MockHttpServletRequestBuilder builder, String token, Object vo) throws Exception {
        builder.accept(APPLICATION_JSON).contentType(APPLICATION_JSON);
        if (token != null) {
            builder.header("token", token);
        }
        if (vo != null) {
            builder.content(JSONUtil.toJsonStr(vo));
        }
        ResultActions result = mockMvc.perform(builder);
        return result;
    }

    public ResultActions performWithJson(MockHttpServletRequestBuilder builder, String token) throws Exception {
        return performWithJson(builder, token, null);
    }

    public ResultActions performWithJson(MockHttpServletRequestBuilder builder) throws Exception {
        return performWithJson(builder, null);
    }

}
