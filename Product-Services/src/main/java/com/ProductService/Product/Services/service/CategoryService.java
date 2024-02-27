package com.ProductService.Product.Services.service;

import com.ProductService.Product.Services.dtos.CategoryDto;
import com.ProductService.Product.Services.dtos.GenericProductDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CategoryService {
    public List<CategoryDto> getAllCategories();


}
