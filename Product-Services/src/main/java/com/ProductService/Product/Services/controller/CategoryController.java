package com.ProductService.Product.Services.controller;

import com.ProductService.Product.Services.dtos.CategoryDto;
import com.ProductService.Product.Services.dtos.GenericProductDto;
import com.ProductService.Product.Services.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping("")
    public List<CategoryDto> getAllProducts(){
        return categoryService.getAllCategories();
    }

}
