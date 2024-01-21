package com.ProductService.Product.Services.service;

import com.ProductService.Product.Services.dtos.GenericProductDto;
import com.ProductService.Product.Services.exceptions.NotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ProductService {
    public GenericProductDto getProductById(Long id) throws NotFoundException;

    public  GenericProductDto createProduct(GenericProductDto genericProductDto);
    public List<GenericProductDto> getAllProducts();

    public GenericProductDto deleteProduct(Long id);

    public GenericProductDto updateProductById(Long id, GenericProductDto productDto);



}
