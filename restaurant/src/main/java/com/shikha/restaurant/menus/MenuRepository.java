package com.shikha.restaurant.menus;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Shikha
 */
public interface MenuRepository extends JpaRepository<Menu, Integer> {
    Menu findByIsDefault(boolean b);
}
