package com.bruno.shopSystem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_user")
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class User implements Serializable {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Integer id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String phone;

    @Getter
    @Setter
    private String password;

    @OneToMany(mappedBy = "client")
    @JsonIgnore
    @Getter
    
    private List<Order> orders = new ArrayList<>();

    @Builder
    public User(Integer id, String name, String email, String phone, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }
}
