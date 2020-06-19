package com.classyex.github.junitdemo.controller;


import com.classyex.github.junitdemo.entity.User;
import com.classyex.github.junitdemo.service.UserRankService;
import com.classyex.github.junitdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * UserController.java <br>
 * @version 1.0 <br>
 * @date 2020/6/15 10:36 <br>
 * @author yex <br>
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRankService userRankService;

    @GetMapping("/{id}")
    public Result<User> getById(@PathVariable Long id) {
        return Result.ok(userService.getById(id));
    }

    @PostMapping
    public Result add(@RequestBody User user) {
        return Result.ok(userService.save(user));
    }

    @PutMapping("/{id}")
    public Result update(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return Result.ok(userService.updateById(user));
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Long id) {
        return Result.ok(userService.removeById(id));
    }

    @GetMapping
    public Result<List<User>> list(String keyword) {
        return Result.ok(userService.listByKeyword(keyword));
    }

    @GetMapping("/age-rank")
    public Result<Integer> ageRank(Long id) {
        return Result.ok(userRankService.getUserAgeRank(id));
    }

}
