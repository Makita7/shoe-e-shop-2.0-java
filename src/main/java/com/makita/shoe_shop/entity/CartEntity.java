package com.makita.shoe_shop.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity(name = "CART")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID cartId;

    @ManyToOne
    @JoinColumn(name = "id")
    private ClientEntity client;

    private List<ShoeEntity> cartProducts;

    @ManyToOne
    @JoinColumn(name = "address")
    private ClientEntity clientAddress;

}
