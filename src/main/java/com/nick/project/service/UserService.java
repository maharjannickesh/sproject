package com.nick.project.service;

import java.sql.Date;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nick.project.entity.User;
import com.nick.project.repository.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	UserRepository userRepository;

	Date date = new Date(new java.util.Date().getTime());

	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	public void addNewUser(User user) {

		System.out.println("inside Save Service");

		user.setAddedTime(date.toString());
		user.setUpdatedTime(date.toString());
		userRepository.save(user);

	}

	public void editUser(User user, int id) {
		user.setId(id);
		System.out.println("user new name is" + user.getFirstName());
		userRepository.save(user);
		userRepository.flush();
	}

	public void deleteUser(int id) {
		userRepository.delete(id);

	}

}
