package com.shikha.restaurant.security.dto;

import lombok.Data;

/**
 * @author Shikha
 */

@Data
public class LoginRequest {
    private String username;
    private String password;
}

