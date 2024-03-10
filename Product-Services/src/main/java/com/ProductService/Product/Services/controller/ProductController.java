//package com.ProductService.Product.Services.controller;
//
//import com.ProductService.Product.Services.dtos.DeleteProductResponse;
//import com.ProductService.Product.Services.dtos.GenericProductDto;
//import com.ProductService.Product.Services.exceptions.NotFoundException;
//import com.ProductService.Product.Services.models.Product;
//import com.ProductService.Product.Services.security.JwtData;
//import com.ProductService.Product.Services.security.TokenValidator;
//import com.ProductService.Product.Services.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//import java.util.List;
//import java.util.Optional;
//import java.util.UUID;
//
//
//@RestController
//@RequestMapping("/products")
//public class ProductController {
//    private ProductService productService;
//    private TokenValidator tokenValidator;
//
//    @Autowired
//    public ProductController(@Qualifier("selfProductServiceImpl") ProductService productService , TokenValidator tokenValidator){
//        this.productService = productService;
//        this.tokenValidator = tokenValidator;
//    }
//
//
//    @GetMapping("{id}")
//    public GenericProductDto getProductById(@RequestHeader(HttpHeaders.AUTHORIZATION) String authToken, @PathVariable("id") long id) throws NotFoundException {
//        Optional<JwtData> jwtDataOptional = tokenValidator.validateToken(authToken);
//        if(jwtDataOptional.isPresent()) {
//            // Do whatever needs to be done according to the business logic
//            // to do - how to intergrate user sercvice with product service to get user details
//        }
//        return productService.getProductById(id);
//    }
//
//
//    @PostMapping()
//  public Product createProduct(@RequestBody GenericProductDto requestDto) throws NotFoundException {
//       return productService.createProduct(requestDto);
//    }
//
//    @GetMapping("")
//    public List<GenericProductDto> getAllProducts(){
//        return productService.getAllProducts();
//
//    }
//    @PutMapping("{id}")
//    public Product updateProductById(@PathVariable("id") long id ,@RequestBody GenericProductDto genericProductDto) throws NotFoundException {
//        return productService.updateProductById(id,genericProductDto);
//    }
//
//    @DeleteMapping("{id}")
//    public DeleteProductResponse deleteProduct(@PathVariable("id") long id) throws NotFoundException {
//    GenericProductDto deletedProduct = productService.deleteProduct(id);
//        String message = "Product deleted successfully.";
//      return new DeleteProductResponse(deletedProduct,message) ;
//    }
//
//    @GetMapping("/category/{id}")
//    public List<Product> getProductByCategory(@PathVariable("id") UUID categoryId) throws NotFoundException {
//        return productService.getProductByCategory(categoryId);
//    }
//
//
//}
