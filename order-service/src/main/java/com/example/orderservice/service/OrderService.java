
package com.example.orderservice.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderservice.client.ProductClient;
import com.example.orderservice.dto.OrderItemRequest;
import com.example.orderservice.dto.PlaceOrderRequest;
import com.example.orderservice.dto.ProductResponse;
import com.example.orderservice.entity.Order;
import com.example.orderservice.entity.OrderItem;
import com.example.orderservice.repository.OrderRepository;


@Service
public class OrderService {
 @Autowired private OrderRepository repo;
 @Autowired private ProductClient productClient;
 
 public Order placeOrder(PlaceOrderRequest req) {

	    Order order = new Order();
	    order.setUserId(req.userId);
	    order.setStatus("PLACED");

	    List<OrderItem> items = new ArrayList<>();
	    double total = 0;

	    for (OrderItemRequest r : req.items) {

	        // 🔹 CALL PRODUCT SERVICE (FIXED)
	        ProductResponse product =
	                productClient.getProduct(r.productId);

	        // 🔹 STOCK CHECK
	        if (product.getStock() < r.quantity) {
	            throw new RuntimeException("Insufficient stock");
	        }

	        // 🔹 USE PRICE FROM RESPONSE
	        double price = product.getPrice();

	        OrderItem item = new OrderItem();
	        item.setProductId(r.productId);
	        item.setQuantity(r.quantity);
	        item.setPrice(price * r.quantity);
	        item.setOrder(order);

	        total += item.getPrice();
	        items.add(item);
	    }

	    order.setTotalAmount(total);
	    order.setOrderItems(items);

	    return repo.save(order);
	}

 
 public List<Order> getOrders(Long userId){
  return repo.findByUserId(userId);
 }
}
