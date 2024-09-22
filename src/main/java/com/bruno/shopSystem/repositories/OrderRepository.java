package com.bruno.shopSystem.repositories;

import com.bruno.shopSystem.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
