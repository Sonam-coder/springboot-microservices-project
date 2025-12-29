
package com.example.productservice.service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productservice.entity.Product;
import com.example.productservice.repository.ProductRepository;

@Service
public class ProductService {

 @Autowired
 private ProductRepository repository;

 public Product save(Product p){ return repository.save(p); }
 public List<Product> findAll(){ return repository.findAll(); }
 public Product findById(Long id) {
	    return repository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Product not found"));
	}
}
