package com.shikha.restaurant.roles;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Shikha
 */
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String roleName);
}
