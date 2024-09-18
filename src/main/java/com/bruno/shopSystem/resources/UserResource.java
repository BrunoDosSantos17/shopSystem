package com.bruno.shopSystem.resources;

import com.bruno.shopSystem.entities.User;
import com.bruno.shopSystem.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserResource {

    @Autowired
    UserServices userServices;
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(userServices.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(userServices.findById(id));
    }
}
