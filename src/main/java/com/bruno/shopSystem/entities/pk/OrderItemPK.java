package com.bruno.shopSystem.entities.pk;

import com.bruno.shopSystem.entities.Order;
import com.bruno.shopSystem.entities.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Embeddable
public class OrderItemPK implements Serializable{

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;


}