package com.shikha.restaurant.users;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Shikha
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
