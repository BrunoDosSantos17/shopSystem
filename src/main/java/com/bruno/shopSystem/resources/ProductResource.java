package com.bruno.shopSystem.resources;

import com.bruno.shopSystem.entities.Product;
import com.bruno.shopSystem.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductResource {

    @Autowired
    private ProductServices ProductServices;
    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = ProductServices.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(ProductServices.findById(id));
    }
}
