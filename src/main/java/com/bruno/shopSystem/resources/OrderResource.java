package com.bruno.shopSystem.resources;

import com.bruno.shopSystem.entities.Order;
import com.bruno.shopSystem.entities.User;
import com.bruno.shopSystem.services.OrderServices;
import com.bruno.shopSystem.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderResource {

    @Autowired
    private OrderServices orderServices;
    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> list = orderServices.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(orderServices.findById(id));
    }
}
