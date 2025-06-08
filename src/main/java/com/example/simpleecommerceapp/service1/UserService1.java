package com.example.simpleecommerceapp.service1;

import com.example.simpleecommerceapp.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService1 {

    private List<User> userList;

    public UserService1() {
        userList = new ArrayList<>();

        User user1 = new User(1, "viknesh", 20, "vikneshr07@gmail.com");
        User user2 = new User(2, "Madhuvanthi", 21, "madhuvanthi272005@gmail.com");
        User user3 = new User(3, "viknesh", 22, "vikneshr2710@gmail.com");

        // Add users to the list (you missed this!)
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
    }

    public Optional<User> getUser(Integer id) {
        for (User user : userList) {
            if (id.equals(user.getID())) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
