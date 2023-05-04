package com.shikha.restaurant.menus;

import com.shikha.restaurant.items.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Shikha
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/menu")
public class MenuAdminController {
    private final MenuService menuService;

    @PostMapping
    public ResponseEntity<Menu> create(@RequestBody Menu menu) {
        return ResponseEntity.ok(menuService.save(menu));
    }

    @PostMapping("/{menuId}/item/add")
    public ResponseEntity<Menu> addItemToMenu(@RequestBody Item item, @PathVariable("menuId") Integer menuId) {
        Menu menu = menuService.findById(menuId);
        return ResponseEntity.ok(menuService.addItem(menu, item));
    }
}
