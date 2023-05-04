package com.shikha.restaurant.orders;

import com.shikha.restaurant.users.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Shikha
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Override
    public List<Order> findOrderByUser(User user) {
        return null;
    }
}
