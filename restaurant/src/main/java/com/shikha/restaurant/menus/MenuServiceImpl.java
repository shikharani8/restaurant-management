package com.shikha.restaurant.menus;

import com.shikha.restaurant.items.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Shikha
 */
@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {
    private final MenuRepository repository;
    @Override
    public Menu getMenu() {
        return repository.findByIsDefault(true);
    }

    @Override
    public Menu save(Menu menu) {
        return repository.save(menu);
    }

    @Override
    public Menu findById(Integer menuId) {
        return repository.findById(menuId).orElseThrow(() -> new RuntimeException("Menu not found"));
    }

    @Override
    public Menu addItem(Menu menu, Item item) {
        menu.getItems().add(item);
        return repository.save(menu);
    }
}
