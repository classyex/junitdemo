package com.classyex.github.junitdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.classyex.github.junitdemo.mapper")
public class JunitdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JunitdemoApplication.class, args);
    }

}
