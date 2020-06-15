package com.classyex.github.junitdemo.base;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author yex <br>
 * @version 1.0 <br>
 * @date 2020/6/12 18:31 <br>
 */
@ExtendWith(SpringExtension.class)
//@MybatisTest
@SpringBootTest
@ActiveProfiles("dev")
@Disabled
public class BaseMapperH2Test {
}
