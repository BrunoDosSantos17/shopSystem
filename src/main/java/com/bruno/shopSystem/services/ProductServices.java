package com.bruno.shopSystem.services;

import com.bruno.shopSystem.entities.Product;
import com.bruno.shopSystem.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository ProductRepository;
    public List<Product> findAll() {
        return ProductRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> Product = ProductRepository.findById(id);
        return Product.get();
    }

}
