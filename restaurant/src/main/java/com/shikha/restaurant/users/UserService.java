package com.shikha.restaurant.users;

import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

/**
 * @author Shikha
 */
public interface UserService extends UserDetailsService {
    Optional<User> findByUsername(String username);

    User save(User user);
    User findLoggedInUser();
}
