package com.ProductService.Product.Services.service;

import com.ProductService.Product.Services.dtos.GenericProductDto;
import com.ProductService.Product.Services.exceptions.NotFoundException;
import com.ProductService.Product.Services.models.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface ProductServiceFakeStore  {



    GenericProductDto getProductById(Long id) throws NotFoundException;

    public GenericProductDto createProduct(GenericProductDto genericProductDto) throws NotFoundException;
   public List<GenericProductDto> getAllProducts();

    public GenericProductDto deleteProduct(long id) throws NotFoundException;



    GenericProductDto deleteProduct(Long id) throws NotFoundException;


    GenericProductDto updateProductById(Long id, GenericProductDto productDto) throws NotFoundException;

    public List<Product> getProductByCategory(UUID categoryId) throws NotFoundException;




}
