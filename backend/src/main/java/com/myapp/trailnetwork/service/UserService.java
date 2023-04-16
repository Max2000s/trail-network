package com.myapp.trailnetwork.service;

import com.myapp.trailnetwork.model.User;
import com.myapp.trailnetwork.repository.UserRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return null;

    }
    public Optional<User> findById(String id) {
        return userRepository.findById(id);
    }
    public User createUser(String username, String email, String password) {
        User newUser = new User();
        newUser.setUsername(username);
        newUser.setEmail(email);
        newUser.setPassword(password);
        return userRepository.save(newUser);
    }

    public User updateUser(String id, String newUsername) {
        User existingUser = userRepository.findById(id).orElse(null);
        if (existingUser != null) {
            existingUser.setUsername(newUsername);
            return userRepository.save(existingUser);
        }
        return null;
    }

    public void deleteById(String id) {
        userRepository.deleteById(id);
    }
}

