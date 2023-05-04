package com.shikha.restaurant.initialization;

import com.shikha.restaurant.roles.Role;
import com.shikha.restaurant.roles.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shikha
 */
@Configuration
@Slf4j
public class RoleInitializer {
    List<String> roles = new ArrayList<String>(){{
        add("ROLE_ADMIN");
        add("ROLE_CHEF");
        add("ROLE_CUSTOMER");
    }};

    public RoleInitializer(final RoleService roleService) {
        createRoles(roleService);
    }

    private void createRoles(RoleService roleService) {
        roles.forEach(roleName -> {
            if(!roleService.findByName(roleName).isPresent()) {
                Role role = new Role();
                role.setName(roleName);
                roleService.save(role);
            }
        });
    }

}
