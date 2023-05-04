package com.shikha.restaurant.roles;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Shikha
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService{
    private final RoleRepository repository;
    @Override
    public Role save(Role role) {
        return repository.save(role);
    }

    @Override
    public Optional<Role> findByName(String roleName) {
        return repository.findByName(roleName);
    }
}
