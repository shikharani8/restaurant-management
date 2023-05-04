package com.shikha.restaurant.menus;

import com.shikha.restaurant.items.Item;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * @author Shikha
 */
@Entity
@Table(name = "tb_menus")
@Data
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private boolean isDefault;
    @ManyToMany
    private Set<Item> items;
}
