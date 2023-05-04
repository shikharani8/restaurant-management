package com.shikha.restaurant.menus;

import com.shikha.restaurant.items.Item;

/**
 * @author Shikha
 */
public interface MenuService {
    Menu getMenu();

    Menu save(Menu menu);

    Menu findById(Integer menuId);

    Menu addItem(Menu menu, Item item);
}
