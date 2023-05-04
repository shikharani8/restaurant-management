package com.shikha.restaurant.items;

import java.util.List;

/**
 * @author Shikha
 */
public interface ItemService {
    List<Item> findAll();
    Item save(Item item);
}
