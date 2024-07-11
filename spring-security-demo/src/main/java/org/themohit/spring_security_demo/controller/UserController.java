package org.themohit.spring_security_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.themohit.spring_security_demo.model.User;
import org.themohit.spring_security_demo.service.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user){
        User newUser=service.registerUser(user);
        return newUser;
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody User user){
        return service.loginUser(user);
    }
}
