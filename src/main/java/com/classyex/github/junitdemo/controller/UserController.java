package com.classyex.github.junitdemo.controller;


import com.classyex.github.junitdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


}
