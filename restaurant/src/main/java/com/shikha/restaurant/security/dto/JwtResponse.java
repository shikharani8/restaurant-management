package com.shikha.restaurant.security.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Shikha
 */
@AllArgsConstructor
@Data
public class JwtResponse {
    private String token;
}
