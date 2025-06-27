package com.makita.shoe_shop.dto;

import lombok.Builder;

import java.util.List;
import java.util.UUID;

@Builder
public class ShoeDTO {
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
