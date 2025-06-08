package com.example.simpleecommerceapp.api.controller;


import com.example.simpleecommerceapp.api.model.User;
import com.example.simpleecommerceapp.service1.UserService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
public class UserController1<optional> {
    private final UserService1 userService1;

    @Autowired
    public UserController1(UserService1 userService1) {
        this.userService1 = userService1;
    }
    @GetMapping("/user")
    public User getUser(@RequestParam Integer id) {
        Optional<User> user = userService1.getUser(id);
        return user.orElse(null);
    }

}
