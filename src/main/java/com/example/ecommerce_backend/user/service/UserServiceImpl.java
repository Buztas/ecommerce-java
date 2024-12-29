package com.example.ecommerce_backend.user.service;

import com.example.ecommerce_backend.exceptions.NotFoundException;
import com.example.ecommerce_backend.model.User;
import com.example.ecommerce_backend.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(UUID id) throws NotFoundException {
        var User = userRepository.findById(id).orElse(null);
        if (User == null) {
            throw new NotFoundException("User does not exist!");
        }
        return User;
    }
}
