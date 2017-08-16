package com.nick.project.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

    /* gives back all the users */
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<User> allUser() {
        return userService.getAllUser();
    }

    /* add user to database */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser(@Valid @RequestBody User user, BindingResult result) {

        userService.addNewUser(user);

        if (result.hasErrors()) {
            return "0";
        }
        return "1";

    }

    /* edit user based on ID */
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String editUser(@PathVariable int id, @Valid @RequestBody User user, BindingResult result) {

        userService.editUser(user, id);
        if (result.hasErrors()) {
            return "0";
        }
        return "1";
    }

    /* delete User based on ID */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return "1";
    }

}
