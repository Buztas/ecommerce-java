package com.example.ecommerce_backend.user.service;

import com.example.ecommerce_backend.exceptions.NotFoundException;
import com.example.ecommerce_backend.model.User;

import java.util.UUID;

public interface UserService {
    User getUser(UUID id) throws NotFoundException;
}
