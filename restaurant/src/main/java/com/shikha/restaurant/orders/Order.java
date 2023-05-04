package com.shikha.restaurant.orders;

import com.shikha.restaurant.items.Item;
import com.shikha.restaurant.users.User;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * @author Shikha
 */
@Entity
@Table(name="tb_orders")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private User customer;
    @OneToOne
    private User chef;
    private LocalDateTime createdAt;
    @OneToMany(fetch = FetchType.EAGER)
    private Set<Item> items;
    private double prices;
    private double tax;
    private double total;
}
