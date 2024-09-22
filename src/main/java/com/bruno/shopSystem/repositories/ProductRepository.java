package com.bruno.shopSystem.repositories;

import com.bruno.shopSystem.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
