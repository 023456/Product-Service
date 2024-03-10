//package com.ProductService.Product.Services.service;
//
//import com.ProductService.Product.Services.dtos.GenericProductDto;
//import com.ProductService.Product.Services.exceptions.NotFoundException;
//import com.ProductService.Product.Services.models.Product;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.UUID;
//
//@Component
//public interface ProductService {
//    public GenericProductDto getProductById(Long id) throws NotFoundException;
//
//    GenericProductDto getProductById(UUID id) throws NotFoundException;
//
//    public  Product createProduct(GenericProductDto genericProductDto) throws NotFoundException;
//    public List<GenericProductDto> getAllProducts();
//
//    public GenericProductDto deleteProduct(Long id) throws NotFoundException;
//
//    public Product updateProductById(Long id, GenericProductDto productDto) throws NotFoundException;
//
//    Product updateProductById(long id, GenericProductDto genericProductDto) throws NotFoundException;
//
//    public List<Product> getProductByCategory(UUID categoryId) throws NotFoundException;
//
//}
