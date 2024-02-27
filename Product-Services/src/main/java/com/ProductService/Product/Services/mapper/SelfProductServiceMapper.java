package com.ProductService.Product.Services.mapper;

import com.ProductService.Product.Services.dtos.CategoryDto;
import com.ProductService.Product.Services.dtos.GenericProductDto;
import com.ProductService.Product.Services.models.Category;
import com.ProductService.Product.Services.models.Price;
import com.ProductService.Product.Services.models.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Getter
@Setter
@Component
public class SelfProductServiceMapper {

        public static GenericProductDto mapProductToDto(Product product){
            GenericProductDto genericProductDto = new GenericProductDto();
            genericProductDto = new GenericProductDto();
            genericProductDto.setTitle(product.getTitle());
            genericProductDto.setDescription(product.getDescription());
            genericProductDto.setImage(product.getImage());
            CategoryDto categoryDto = new CategoryDto(product.getCategory());
            genericProductDto.setCategory(categoryDto);
            genericProductDto.setPriceValue(product.getPrice().getPrice());
            genericProductDto.setPriceCurrency(product.getPrice().getCurrency());
            genericProductDto.setInventoryCount(product.getInventoryCount());
            return genericProductDto;
    }

    public static Product mapDtoToProduct(GenericProductDto productDto, Category category ,
                                          Price price){
            Product product = new Product();
            product.setTitle(productDto.getTitle());
            product.setImage(productDto.getImage());
            product.setDescription(productDto.getDescription());
            product.setPrice(price);
            product.setCategory(category);
            product.setInventoryCount(productDto.getInventoryCount());
            return product;
    }
    public static  Category mapDtoToCategory(CategoryDto categoryDto) {
        Category category = new Category();
        category.setName(categoryDto.getName());
        return category;
    }

    public static CategoryDto mapCategoryToDto(Category category) {
        CategoryDto dto = new CategoryDto();
        dto.setName(category.getName());
        return dto;
    }
}
