package com.ProductService.Product.Services.dtos;

import com.ProductService.Product.Services.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericProductDto {
    private long id;
    private String title;
    private String description;
    private String image;
    private String category;
    private double price;
}

