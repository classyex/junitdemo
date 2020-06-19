package com.classyex.github.junitdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * JunitdemoApplication.java <br>
 * @version 1.0 <br>
 * @date 2020/6/15 14:40 <br>
 * @author yex <br>
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.classyex.github.junitdemo.mapper",
        "com.classyex.github.junitdemo.dao"})
public class JunitdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JunitdemoApplication.class, args);
    }

}
