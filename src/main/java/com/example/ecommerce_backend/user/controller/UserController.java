package com.example.ecommerce_backend.user.controller;

import com.example.ecommerce_backend.exceptions.NotFoundException;
import com.example.ecommerce_backend.model.User;
import com.example.ecommerce_backend.user.service.UserService;
import com.example.ecommerce_backend.user.service.UserServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.aspectj.weaver.ast.Not;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/users")
@Tag(name = "User", description = "API for managing users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("{id}")
    public ResponseEntity<User> getUser(@PathVariable UUID id) throws NotFoundException {
        var user = userService.getUser(id);
        return ResponseEntity.ok(user);
    }

//    @PostMapping
//    public String addUser(@RequestBody @Valid User user) {
//    }
}
