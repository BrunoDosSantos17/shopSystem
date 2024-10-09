package com.bruno.shopSystem.repositories;

import com.bruno.shopSystem.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
