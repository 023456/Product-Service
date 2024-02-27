package com.ProductService.Product.Services.service;

import com.ProductService.Product.Services.dtos.CategoryDto;
import com.ProductService.Product.Services.models.Category;
import com.ProductService.Product.Services.repositories.CategoryRepo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepo categoryRepo;

    public CategoryServiceImpl(CategoryRepo categoryRepo){
        this.categoryRepo = categoryRepo;
    }
    @Override
    public List<CategoryDto> getAllCategories() {
        List<Category> categories = categoryRepo.findAll();
        List<CategoryDto> categoryDtos = new ArrayList<>();
        for(Category category : categories){
            CategoryDto categoryDto = new CategoryDto();
            categoryDto.setId(category.getId());
            categoryDto.setName(category.getName());
            categoryDtos.add(categoryDto);
        }
        return categoryDtos;
    }

}
