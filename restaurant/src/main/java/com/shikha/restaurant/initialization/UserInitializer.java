package com.shikha.restaurant.initialization;

import com.shikha.restaurant.roles.Role;
import com.shikha.restaurant.roles.RoleService;
import com.shikha.restaurant.users.User;
import com.shikha.restaurant.users.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Shikha
 */
@Configuration
@Slf4j
public class UserInitializer {

    public UserInitializer(final RoleService roleService,
                           final UserService userService,
                           final PasswordEncoder passwordEncoder) {
        createUser(passwordEncoder, roleService, userService,
                "ROLE_ADMIN", "admin",
                "Password@1", "Admin",
                "admin@email.com");
        createUser(passwordEncoder, roleService, userService,
                "ROLE_CHEF", "chef",
                "Password1", "Chef",
                "chef@email.com");
        createUser(passwordEncoder, roleService, userService,
                "ROLE_CUSTOMER", "customer",
                "Password1", "customer",
                "customer@email.com");
    }

    private void createUser(PasswordEncoder passwordEncoder,
                            RoleService roleService,
                            UserService userService,
                            String roleName,
                            String username,
                            String password,
                            String name,
                            String email) {
        if(!userService.findByUsername(username).isPresent()) {
            Role role = roleService.findByName(roleName)
                    .orElseThrow(() -> new RuntimeException("Invalid Role Name"));
            User user = new User();
            user.setName(name);
            user.setEmail(email);
            user.setUsername(username);
            user.setPassword(passwordEncoder.encode(password));
            user.setRole(role);
            userService.save(user);
        }
    }

}
