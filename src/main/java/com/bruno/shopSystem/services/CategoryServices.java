package com.bruno.shopSystem.services;

import com.bruno.shopSystem.entities.Category;
import com.bruno.shopSystem.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServices {

    @Autowired
    private CategoryRepository CategoryRepository;
    public List<Category> findAll() {
        return CategoryRepository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> Category = CategoryRepository.findById(id);
        return Category.get();
    }

}
