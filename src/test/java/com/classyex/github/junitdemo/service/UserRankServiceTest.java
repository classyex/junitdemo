package com.classyex.github.junitdemo.service;

import com.classyex.github.junitdemo.base.BaseServiceTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author yex <br>
 * @version 1.0 <br>
 * @date 2020/6/15 14:59 <br>
 */
public class UserRankServiceTest extends BaseServiceTest {

    @Autowired
    private UserRankService userRankService;

    @Test
    public void should_get_user_age_rank() {
        int rank = userRankService.getUserAgeRank(3L);
        Assertions.assertEquals(5, rank);
    }

    @Test
    public void should_get_max_rank_when_user_not_exist() {
        int userAgeRank = userRankService.getUserAgeRank(100L);
        Assertions.assertEquals(Integer.MAX_VALUE, userAgeRank);
    }

}
