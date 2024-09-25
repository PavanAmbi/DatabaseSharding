package com.practice.springbootdatashard.service;

import com.practice.springbootdatashard.repository.UserRepository;
import com.practice.springbootdatashard.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class UserService {

    private UserRepository userRepository;


    @Autowired
    public UserService(UserRepository repository){


        this.userRepository=repository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
