package com.example.ecommerce_backend.user.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@Tag(name = "User", description = "API for managing users")
public class UserController {

    @GetMapping
    public String hello() {
        return "Hello World";
    }
}
