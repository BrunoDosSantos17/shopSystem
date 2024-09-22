package com.bruno.shopSystem.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_category")
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Integer id;

    @Setter
    @Getter
    private String name;

    @Transient
    @Getter
    private Set<Product> products = new HashSet<>();

    public Category(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
