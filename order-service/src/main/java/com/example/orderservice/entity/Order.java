
package com.example.orderservice.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name="orders")

public class Order {
	 @Id
	    @GeneratedValue(
	        strategy = GenerationType.SEQUENCE,
	        generator = "order_seq"
	    )
	    @SequenceGenerator(
	        name = "order_seq",
	        sequenceName = "order_seq",
	        allocationSize = 1
	    )
 private Long id;
 private Long userId;
 private double totalAmount;
 private String status;

 @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
 @JsonManagedReference
 private List<OrderItem> orderItems;

 //  GETTERS & SETTERS

 public Long getId() {
     return id;
 }

 public void setId(Long id) {
     this.id = id;
 }

 public Long getUserId() {
     return userId;
 }

 public void setUserId(Long userId) {
     this.userId = userId;
 }

 public double getTotalAmount() {
     return totalAmount;
 }

 public void setTotalAmount(double totalAmount) {
     this.totalAmount = totalAmount;
 }

 public String getStatus() {
     return status;
 }

 public void setStatus(String status) {
     this.status = status;
 }

 public List<OrderItem> getOrderItems() {
     return orderItems;
 }

 public void setOrderItems(List<OrderItem> orderItems) {
     this.orderItems = orderItems;
 }

}
