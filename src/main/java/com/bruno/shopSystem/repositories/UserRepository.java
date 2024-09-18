package com.bruno.shopSystem.repositories;

import com.bruno.shopSystem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
