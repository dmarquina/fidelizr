package com.example.fidelizr.service.impl;

import com.example.fidelizr.model.User;
import com.example.fidelizr.repository.UserRepository;
import com.example.fidelizr.service.SaleService;
import com.example.fidelizr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.function.Supplier;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    public User getUser() {
        Optional<User> user = userRepository.findById("1");
        return user.orElseGet(User::new);
    }
}
