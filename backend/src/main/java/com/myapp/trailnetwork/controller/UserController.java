package com.myapp.trailnetwork.controller;

import com.myapp.trailnetwork.model.User;
import com.myapp.trailnetwork.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    // creating a new user
    @PostMapping
    public User createNewUser(String userName, String email, String password) {
        return userService.createUser(userName, email, password);
    }

    // update user name
    @PostMapping
    public User upddateUser(String id, String newUserName) {
        return userService.updateUser(id, newUserName);
    }

    // Add more request mappings for other CRUD operations
}
