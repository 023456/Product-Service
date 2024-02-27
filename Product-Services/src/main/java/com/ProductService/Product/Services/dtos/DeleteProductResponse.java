package com.ProductService.Product.Services.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DeleteProductResponse {

    private String title;
    private String description;
    private String image;
    private CategoryDto category;
    private double priceValue;
    private String priceCurrency;
    private int inventoryCount;
    private String message;

    public DeleteProductResponse(GenericProductDto deletedProduct, String message) {

        this.title = deletedProduct.getTitle();
        this.description = deletedProduct.getDescription();
        this.image = deletedProduct.getImage();
        this.category = deletedProduct.getCategory();
        this.priceValue = deletedProduct.getPriceValue();
        this.priceCurrency = deletedProduct.getPriceCurrency();
        this.inventoryCount = deletedProduct.getInventoryCount();
        this.message = message;
    }

    // getters and setters
}

