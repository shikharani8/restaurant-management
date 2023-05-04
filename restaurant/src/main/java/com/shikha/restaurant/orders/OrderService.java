package com.shikha.restaurant.orders;

import com.shikha.restaurant.users.User;

import java.util.List;

/**
 * @author Shikha
 */
public interface OrderService {
    List<Order> findOrderByUser(User user);
}
