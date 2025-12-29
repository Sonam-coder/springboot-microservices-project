
package com.example.orderservice.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "order_items")
public class OrderItem {

	 @Id
	    @GeneratedValue(
	        strategy = GenerationType.SEQUENCE,
	        generator = "order_item_seq"
	    )
	    @SequenceGenerator(
	        name = "order_item_seq",
	        sequenceName = "order_item_seq",
	        allocationSize = 1
	    )

 private Long id;
 private Long productId;
 private int quantity;
 private double price;

 @ManyToOne
 @JoinColumn(name = "order_id")
 @JsonIgnore
 private Order order;


 // 🔴 GETTERS & SETTERS

 public Long getId() {
     return id;
 }

 public void setId(Long id) {
     this.id = id;
 }

 public Long getProductId() {
     return productId;
 }

 public void setProductId(Long productId) {
     this.productId = productId;
 }

 public int getQuantity() {
     return quantity;
 }

 public void setQuantity(int quantity) {
     this.quantity = quantity;
 }

 public double getPrice() {
     return price;
 }

 public void setPrice(double price) {
     this.price = price;
 }

 public Order getOrder() {
     return order;
 }

 public void setOrder(Order order) {
     this.order = order;
 }

}
