package com.classyex.github.junitdemo.base;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yex <br>
 * @version 1.0 <br>
 * @date 2020/6/12 18:31 <br>
 */
@ExtendWith(SpringExtension.class)
//@MybatisTest
@SpringBootTest
@ActiveProfiles("dev")
@Transactional
@Rollback
@Disabled
public class BaseMapperH2Test {
}
