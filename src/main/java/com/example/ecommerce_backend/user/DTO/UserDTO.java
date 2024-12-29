package com.example.ecommerce_backend.user.DTO;

import com.example.ecommerce_backend.user.enums.UserRole;
import jakarta.validation.constraints.NotNull;

public record UserDTO(@NotNull String name,@NotNull String surname, String email, String phone, UserRole role, Integer businessId) {}
