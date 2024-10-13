package com.bruno.shopSystem.entities;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AccessLevel;


@Entity
@Table(name = "tb_payments")
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor
public class Payment implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Integer id;

    @Getter
    @Setter
    private Instant date;

    @OneToOne
    @MapsId
    @Getter
    @Setter
    @JsonIgnore
    private Order order;
}
