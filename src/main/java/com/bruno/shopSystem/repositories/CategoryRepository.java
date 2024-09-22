package com.bruno.shopSystem.repositories;

import com.bruno.shopSystem.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
