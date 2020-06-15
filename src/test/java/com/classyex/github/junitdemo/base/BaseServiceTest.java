package com.classyex.github.junitdemo.base;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author yex
 * @date 2019/10/18 17:26
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles("dev")
@Disabled
public class BaseServiceTest {
}
