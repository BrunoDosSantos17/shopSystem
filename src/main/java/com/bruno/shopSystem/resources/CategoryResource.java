package com.bruno.shopSystem.resources;

import com.bruno.shopSystem.entities.Category;
import com.bruno.shopSystem.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("categories")
public class CategoryResource {

    @Autowired
    private CategoryServices CategoryServices;
    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = CategoryServices.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(CategoryServices.findById(id));
    }
}
