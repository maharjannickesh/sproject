package com.nick.project.service;

import java.sql.Date;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nick.project.entity.User;
import com.nick.project.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    Date date = new Date(new java.util.Date().getTime());

    User newUser = new User();

    @Transactional
    public void saveUser() {
        System.out.println("Inside Save User");
        newUser.setFirstName("New");
        newUser.setLastName("Maharjan");
        newUser.setEmail("abc@abc.com");
        newUser.setPassword("123456789");
        newUser.setEnabled(true);
        newUser.setAddedBy("Nikesh");
        newUser.setAddedTime(date.toString());
        newUser.setUpdatedBy("NikeshUPD");
        newUser.setUpdatedTime(date.toString());

        userRepository.save(newUser);

    }

}
