//package com.ProductService.Product.Services.controller;
//
//import com.ProductService.Product.Services.dtos.GenericProductDto;
//import com.ProductService.Product.Services.exceptions.NotFoundException;
//import com.ProductService.Product.Services.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//
//@RestController
//@RequestMapping("/products")
//public class ProductControllerFakeStore {
//
//    private ProductService productService;
//
//    @Autowired
//    public ProductControllerFakeStore(@Qualifier("fakeStoreProductService") ProductService productService){
//        this.productService = productService;
//    }
//
//    @GetMapping()
//    public List<GenericProductDto> getAllProducts(){
//        return productService.getAllProducts();
//
//    }
//
//    @GetMapping("{id}")
//    public GenericProductDto getProductById(@PathVariable("id") Long id) throws NotFoundException {
//        return productService.getProductById(id);
//    }
//
//    @PutMapping("{id}")
//    public GenericProductDto updateProductById(@PathVariable("id") Long id ,@RequestBody GenericProductDto genericProductDto){
//        return productService.updateProductById(id,genericProductDto);
//    }
//
//   @PostMapping()
//    public GenericProductDto createProduct(@RequestBody GenericProductDto genericProductDto) throws NotFoundException {
//        return productService.createProduct(genericProductDto);
//
//    }
//
//    @DeleteMapping("{id}")
//    public ResponseEntity<GenericProductDto> deleteProduct(@PathVariable("id") Long id){
//      return new ResponseEntity<>(productService.deleteProduct(id),HttpStatus.OK);
////      return productService.deleteProduct(id);
//    }
//
//    // This is specific to this controller
////    @ExceptionHandler(NotFoundException.class)
////    public ResponseEntity<ExceptionDto> handleNotFoundException(NotFoundException notFoundException) {
////        return new ResponseEntity<>(new ExceptionDto(HttpStatus.NOT_FOUND, notFoundException.getMessage()),
////                HttpStatus.NOT_FOUND);
////    }
//
//}
