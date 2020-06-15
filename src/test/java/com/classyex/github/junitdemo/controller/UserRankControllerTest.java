package com.classyex.github.junitdemo.controller;

import com.classyex.github.junitdemo.base.BaseControllerH2Test;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @author yex <br>
 * @version 1.0 <br>
 * @date 2020/6/15 15:07 <br>
 */
public class UserRankControllerTest extends BaseControllerH2Test {

    @Test
    public void should_get_user_age_rank() throws Exception {
        ResultActions resultActions = performWithJson(
                MockMvcRequestBuilders.get("/users/age-rank")
                        .param("id", String.valueOf(3)), ADMIN_TOKEN);
        TestAssistant.assertSuccess(resultActions)
                .andExpect(MockMvcResultMatchers.jsonPath("$.data").value(5));
    }

}
