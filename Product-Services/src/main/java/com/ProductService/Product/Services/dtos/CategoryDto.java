package com.ProductService.Product.Services.dtos;

import com.ProductService.Product.Services.models.Category;
import com.ProductService.Product.Services.models.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto implements Serializable {
   private UUID id;
    private String name;

    public CategoryDto(String name) {
        this.name = name;
    }

    public CategoryDto(Category category) {
            this.id = category.getId();
            this.name = category.getName();
    }
}
