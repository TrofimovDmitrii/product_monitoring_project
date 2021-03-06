package com.springboot.product_monitoring.repositories;

import com.springboot.product_monitoring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	Optional<Product> findByProductName(String productName);
}