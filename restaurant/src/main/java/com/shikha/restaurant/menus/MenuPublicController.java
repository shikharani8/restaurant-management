package com.shikha.restaurant.menus;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Shikha
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/public/menu")
public class MenuPublicController {
    private final MenuService menuService;

    @GetMapping
    public ResponseEntity<Menu> getMenu() {
        return ResponseEntity.ok(menuService.getMenu());
    }
}
