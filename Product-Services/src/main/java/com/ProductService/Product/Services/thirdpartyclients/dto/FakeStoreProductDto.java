package com.ProductService.Product.Services.thirdpartyclients.dto;

import com.ProductService.Product.Services.dtos.CategoryDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    private String title;
    private CategoryDto category;
    private double priceValue;
    private String priceCurrency;
    private String description;
    private String image;
}
