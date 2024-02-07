package com.geraldoliva.ecommerce.dao;

import com.geraldoliva.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
