package com.nick.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nick.project.entity.User;
import com.nick.project.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute("user")
	private User construct() {
		return new User();
	}

	
	@RequestMapping(value = "/all")
	public @ResponseBody List<User> allUser(){
		System.out.println("Inside All User");
		return userService.saveUser();
	}

}
