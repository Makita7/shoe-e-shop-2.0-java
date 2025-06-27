package com.makita.shoe_shop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Entity(name = "SHOE_ENTITY")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShoeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private Integer stock;

    private List<String> categories;

    private List<String> colors;

    private String brand;

    private List<String> availableSizes;

    private Integer price;

    private String material;

    private String usage;

}
