package com.bruno.shopSystem.entities;



import com.bruno.shopSystem.entities.enums.OrderStatus;
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

    @Getter
    @Setter
    private Instant moment;

    @Setter
    @Getter
    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    private Integer orderStatus;


    public Order(Integer id, Instant moment, OrderStatus orderStatus, User client ) {
        super();
        this.id = id;
        this.moment = moment;
        setOrderStatus(orderStatus);
        this.client = client;
    }
    public OrderStatus getOrderStatus() {
        return OrderStatus.valueOf(orderStatus);
    }

    public void setOrderStatus(OrderStatus orderStatus){
        if(orderStatus != null) {
            this.orderStatus = orderStatus.getCode();
        }
    }
}
