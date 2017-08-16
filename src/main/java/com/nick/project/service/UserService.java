package com.nick.project.service;

import java.sql.Date;
import java.util.ArrayList;
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

    User newUser = new User();

    List<User> users = new ArrayList<>();

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

        // users.add(newUser);
        userRepository.save(newUser);

    }

    public List<User> getAllUser() {
        // return users;
        return userRepository.findAll();
    }

    public void addNewUser(User user) {

        System.out.println("inside Save Service");

        /*
         * newUser.setId(user.getId());
         * newUser.setFirstName(user.getFirstName());
         * newUser.setLastName(user.getLastName());
         * newUser.setEmail(user.getEmail());
         * newUser.setPassword(user.getPassword()); newUser.setEnabled(true);
         * newUser.setAddedBy("Nikesh"); newUser.setAddedTime(date.toString());
         * newUser.setUpdatedBy("NikeshUPD");
         * newUser.setUpdatedTime(date.toString()); users.add(newUser);
         */

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
