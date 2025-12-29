
package com.example.orderservice.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderservice.dto.PlaceOrderRequest;
import com.example.orderservice.entity.Order;
import com.example.orderservice.service.OrderService;


@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired 
    private OrderService service;

    @PostMapping
    public Order place(@RequestBody PlaceOrderRequest r){
        return service.placeOrder(r);
    }

    @GetMapping("/user/{id}")
    public List<Order> byUser(@PathVariable Long id){
        return service.getOrders(id);
    }
}

