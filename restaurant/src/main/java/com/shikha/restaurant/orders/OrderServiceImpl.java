package com.shikha.restaurant.orders;

import com.shikha.restaurant.items.Item;
import com.shikha.restaurant.users.User;
import com.shikha.restaurant.users.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

/**
 * @author Shikha
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository repository;
    private final UserService userService;
    private double TAX_PERCENTAGE = 10;
    @Override
    public List<Order> findOrderByUser(User user) {
        return repository.findByCustomerOrChef(user, user);
    }

    @Override
    public Order createOrder(Order order) {
        order.setCreatedAt(LocalDateTime.now());
        order.setCustomer(userService.findLoggedInUser());
        order.setChef(userService.findByUsername("chef")
                .orElseThrow(() -> new RuntimeException("User not found")));
        order.setPrices(calculatePrices(order.getItems()));
        order.setTax(calculateTax(order.getPrices()));
        order.setTotal(order.getPrices() + order.getTax());
        return repository.save(order);
    }

    private double calculateTax(double prices) {
        return prices * TAX_PERCENTAGE/100;
    }

    private double calculatePrices(Set<Item> items) {
        double prices = 0.0;
        for(Item item : items) {
            prices = prices + Double.valueOf(item.getPrice());
        }
        return prices;
    }
}
