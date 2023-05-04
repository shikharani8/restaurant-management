package com.shikha.restaurant.roles;

import java.util.Optional;

/**
 * @author Shikha
 */
public interface RoleService {
    Role save(Role role);

    Optional<Role> findByName(String roleName);
}
