package com.nick.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nick.project.entity.User;
import com.nick.project.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ModelAttribute("user")
    private User construct() {
        return new User();
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<User> allUser() {
        System.out.println("Inside All User");
        return null;
        // return userService.saveUser();
    }

    @RequestMapping(value = "/add")
    public String addUser() {
        System.out.println("Inside ADD user");
        userService.saveUser();
        return "Done";
    }

}
