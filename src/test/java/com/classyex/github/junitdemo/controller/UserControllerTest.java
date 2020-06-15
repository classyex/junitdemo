package com.classyex.github.junitdemo.controller;

import com.classyex.github.junitdemo.base.BaseControllerH2Test;
import com.classyex.github.junitdemo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @author yex <br>
 * @version 1.0 <br>
 * @date 2020/6/12 17:33 <br>
 */
public class UserControllerTest extends BaseControllerH2Test {

    @Test
    public void should_get_user_by_id() throws Exception {
        ResultActions resultActions = performWithJson(
                MockMvcRequestBuilders.get("/users/{id}", 1));
        TestAssistant.assertSuccess(resultActions)
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.name").value("Jone"));
    }

    @Test
    public void should_add_a_user() throws Exception {
        User user = new User();
        user.setName("zhangs");
        ResultActions resultActions = performWithJson(
                MockMvcRequestBuilders.post("/users"), ADMIN_TOKEN, user);
        TestAssistant.assertSuccess(resultActions)
                .andExpect(MockMvcResultMatchers.jsonPath("$.data").value(true));
    }

    @Test
    public void shoul_modifer_user_name_and_not_other() throws Exception {
        User user = new User();
        user.setName("zhangs");
        ResultActions resultActions = performWithJson(
                MockMvcRequestBuilders.put("/users/{id}", 1), ADMIN_TOKEN, user);
        TestAssistant.assertSuccess(resultActions)
                .andExpect(MockMvcResultMatchers.jsonPath("$.data" ).value(true));
    }

    @Test
    public void should_delete_user_by_id() throws Exception {
        ResultActions resultActions = performWithJson(
                MockMvcRequestBuilders.delete("/users/{id}", 1), ADMIN_TOKEN);
        TestAssistant.assertSuccess(resultActions)
                .andExpect(MockMvcResultMatchers.jsonPath("$.data").value(true));
    }

    @Test
    public void should_list_users() throws Exception {
        ResultActions resultActions = performWithJson(
                MockMvcRequestBuilders.get("/users")
                        .param("keyword", "n"), ADMIN_TOKEN);
        TestAssistant.assertSuccess(resultActions)
                .andExpect(MockMvcResultMatchers.jsonPath("$.data.length()").value(2))
                .andExpect(MockMvcResultMatchers.jsonPath("$.data[0].name").value("Jone"));
    }

}
