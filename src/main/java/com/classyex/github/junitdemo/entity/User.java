package com.classyex.github.junitdemo.entity;

import lombok.Data;

/**
 * User.java <br>
 * @version 1.0 <br>
 * @date 2020/6/15 14:36 <br>
 * @author yex <br>
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}