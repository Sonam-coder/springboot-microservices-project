package com.example.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.userservice.entity.User;
import com.example.userservice.repository.UserRepository;

@RestController
@RequestMapping("/auth")
@CrossOrigin   //  IMPORTANT for frontend & Postman
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        System.out.println("Register request received: " + user.getEmail());
        return userRepository.save(user);
    }

    @PostMapping("/login")
    public User login(@RequestBody User request) {
        return userRepository.findAll()
                .stream()
                .filter(u -> u.getEmail().equals(request.getEmail())
                          && u.getPassword().equals(request.getPassword()))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Invalid credentials"));
    }
}
