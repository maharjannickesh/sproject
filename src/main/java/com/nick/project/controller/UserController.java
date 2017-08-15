package com.nick.project.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
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
		// return null;
		// userService.saveUser();
		return userService.getAllUser();
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addUser(@Valid @RequestBody User user, BindingResult result) {

		System.out.println(user.getFirstName());
		System.out.println("inside Save");
		userService.addNewUser(user);

		if (result.hasErrors()) {
			return "0";
		}
		return "1";

		/*
		 * System.out.println("Inside ADD user"); userService.saveUser(); return
		 * "Done";
		 */
	}

}
