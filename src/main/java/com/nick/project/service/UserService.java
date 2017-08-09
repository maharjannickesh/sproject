package com.nick.project.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.nick.project.entity.User;

@Service
@Component
public class UserService {

	User newUser;

	public List<User> saveUser() {
		List<User> users = new ArrayList<>();
		System.out.println("Inside Saving User" +users.size());
		
		newUser.setFirstName("Nickesh");
		newUser.setLastName("Maharjan");
		newUser.setEmail("abc@abc.com");
		newUser.setPassword("123456789");
		newUser.setEnabled(true);
		newUser.setId(1);
		users.add(newUser);

		if (users != null) {
			System.out.println("Users Not Null");
		} else {
			System.out.println("Users Null");
		}
		return users;
	}

}
