package com.shikha.restaurant.orders;

import com.shikha.restaurant.users.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Shikha
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository repository;
    @Override
    public List<Order> findOrderByUser(User user) {
        return repository.findByCustomerOrChef(user, user);
    }

    @Override
    public Order createOrder(Order order) {
        return null;
    }
}
