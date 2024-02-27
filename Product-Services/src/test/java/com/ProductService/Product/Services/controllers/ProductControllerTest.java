//package com.ProductService.Product.Services.controllers;
//
//import com.ProductService.Product.Services.controller.ProductController;
//import com.ProductService.Product.Services.dtos.GenericProductDto;
//import com.ProductService.Product.Services.exceptions.NotFoundException;
//import com.ProductService.Product.Services.models.Product;
//import com.ProductService.Product.Services.service.ProductService;
//import com.ProductService.Product.Services.service.SelfProductService;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//
//import java.util.UUID;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.when;
//
//@RunWith(MockitoJUnitRunner.class)
//public class ProductControllerTest {
//
//    @InjectMocks
//    ProductController productController;
//
//    @Mock
//    ProductService productServiceMock;

//    @Test()
//    public void testMathOperations(){
//       int result =  add(1,2);
//       assert(result==5);
//        System.out.println("Test is passed with correct output");

//        Assertions.assertEquals(3,result);
//        Assertions.assertEquals(7, result, "Output add");
//        Integer result2 = add(4,6);
//        Assertions.assertNull(result2);

//        Assertions.assertThrows(NullPointerException.class, () -> doSomething());
//    }
//
//    private int add(int a, int b) {
//        return a + b;
//    }
//    private void doSomething() {
//        throw new NullPointerException();
//    }

//    @Test
//    public void testGetProductByIdReturnsEmptyObjectWhenNoProductIsFound() throws NotFoundException {
//        UUID fakeUUID = UUID.fromString("fa2eac4d-124f-43d9-b3ec-330e110c6ff9");
////        String fakeUUIDString = fakeUUID.toString();
//
//        when(productServiceMock.getProductById(any(UUID.class))).thenReturn(null);
//
//        GenericProductDto response = productController.getProductById(fakeUUID);
//        Assertions.assertNull(response);
//    }
//
////    @Test
//    public void testGetProductByIdThrowsNotFoundException() throws NotFoundException {
//        UUID fakeUUID = UUID.fromString("fa2eac4d-124f-43d9-b3ec-330e110c6ff9");
////        String fakeUUIDString = fakeUUID.toString();
//
//        when(productServiceMock.getProductById(any(UUID.class))).thenThrow(NotFoundException.class);
//        Assertions.assertThrows( NotFoundException.class, () -> productController.getProductById(fakeUUID));
//    }
//
////    @Test
//    public void testGetProductById() throws NotFoundException {
//        UUID fakeUUID = UUID.fromString("fa2eac4d-124f-43d9-b3ec-330e110c6ff9");
//        GenericProductDto product = new GenericProductDto();
//        product.setId(fakeUUID);
//        when(productServiceMock.getProductById(any(UUID.class))).thenReturn(product);
//        GenericProductDto response = productController.getProductById(fakeUUID);
//        Assert.assertEquals(response.getId(), fakeUUID);
//        Assert.assertEquals(response.getTitle(), product.getTitle());
//        System.out.println(response.getId());
//    }
//
////    @Test
//    public void testCreateProduct() throws NotFoundException {
//        GenericProductDto dto = new GenericProductDto();
//        dto.setTitle("UnitTesting");
//        Product fakeProduct = new Product();
//        fakeProduct.setTitle("UnitTesting");
//        when(productServiceMock.createProduct(any(GenericProductDto.class))).thenReturn(fakeProduct);
//        Product createdProduct = productController.createProduct(dto);
//        Mockito.verify(productServiceMock, times(1)).createProduct(dto);
//        Assert.assertEquals(dto.getTitle(), createdProduct.getTitle());
//
//    }
//
//
//
//    }
//
//

