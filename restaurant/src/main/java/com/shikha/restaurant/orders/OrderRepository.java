package com.shikha.restaurant.orders;

import com.shikha.restaurant.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Shikha
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByCustomerOrChef(User Customer, User chef);
}
