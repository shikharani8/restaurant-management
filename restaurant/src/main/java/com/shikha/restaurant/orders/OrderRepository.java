package com.shikha.restaurant.orders;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Shikha
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
