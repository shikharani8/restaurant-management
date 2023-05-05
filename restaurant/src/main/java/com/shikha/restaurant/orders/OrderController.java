package com.shikha.restaurant.orders;

import com.shikha.restaurant.users.User;
import com.shikha.restaurant.users.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Shikha
 */
@RequestMapping("/api/order")
@RestController
@RequiredArgsConstructor
@Slf4j
public class OrderController {
    private final OrderService orderService;
    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<Order>> orders() {
        User user = userService.findLoggedInUser();
        return ResponseEntity.ok(orderService.findOrderByUser(user));
    }

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        return ResponseEntity.ok(orderService.createOrder(order));
    }


}

