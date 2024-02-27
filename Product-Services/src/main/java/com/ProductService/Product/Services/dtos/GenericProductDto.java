package com.ProductService.Product.Services.dtos;

import com.ProductService.Product.Services.models.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GenericProductDto {
    private String title;
    private String description;
    private String image;
    private CategoryDto category;
    private double priceValue; // Price value
    private String priceCurrency; // Currency
    private int inventoryCount;

    // Constructor to create GenericProductRequestDto from Product
    public GenericProductDto(Product product) {

        this.title = product.getTitle();
        this.description = product.getDescription();
        this.image = product.getImage();
        this.category = new CategoryDto(product.getCategory());
        this.priceValue = product.getPrice().getPrice();
        this.priceCurrency = product.getPrice().getCurrency();
        this.inventoryCount = product.getInventoryCount();
    }
}

