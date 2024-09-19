package com.bruno.shopSystem.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Table(name = "tb_order")
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Integer id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Instant moment;

    @Setter
    @Getter
    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;
}
