package com.ProductService.Product.Services.thirdpartyclients;

import com.ProductService.Product.Services.thirdpartyclients.dto.FakeStoreProductDto;
import com.ProductService.Product.Services.dtos.GenericProductDto;
import com.ProductService.Product.Services.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class FakeStoreProductClient {
    @Value("${fakestore.api.baseurl}")
    private String fakeStoreApiBaseUrl;

    @Value("${fakestore.api.product}")
    private String fakeStoreProductPath;
    private final String productPath = "/products";

    private String productUrl = fakeStoreApiBaseUrl + productPath + "/{id}";
    private String productRequestUrl = fakeStoreApiBaseUrl + fakeStoreProductPath;

    private RestTemplateBuilder restTemplateBuilder;


    @Autowired
    public FakeStoreProductClient(RestTemplateBuilder restTemplateBuilder , @Value("${fakestore.api.baseurl}") String fakeStoreApiBaseUrl,
                                  @Value("${fakestore.api.product}") String fakeStoreProductPath){
      this.restTemplateBuilder = restTemplateBuilder;
        this.productUrl = fakeStoreApiBaseUrl + productPath + "/{id}";
        this.productRequestUrl = fakeStoreApiBaseUrl + fakeStoreProductPath;
    }


    public FakeStoreProductDto getProductById(Long id) throws NotFoundException {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto> responseEntity=
                restTemplate.getForEntity(productUrl, FakeStoreProductDto.class,id);
        FakeStoreProductDto fakeStoreProductDto = responseEntity.getBody();
        if(fakeStoreProductDto==null){
            throw new NotFoundException("Product with id: " + id + " not found");
        }

        return fakeStoreProductDto;
    }

    public FakeStoreProductDto createProduct(GenericProductDto productDto) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto> responseEntity =
                restTemplate.postForEntity(productRequestUrl,productDto, FakeStoreProductDto.class);

        FakeStoreProductDto fakeStoreProductDto = responseEntity.getBody();


        return fakeStoreProductDto;

    }

    public List<FakeStoreProductDto> getAllProducts() {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto[]> responseEntity =
                restTemplate.getForEntity(productRequestUrl, FakeStoreProductDto[].class);
        FakeStoreProductDto[] fakeStoreProductDtos = responseEntity.getBody();


        return Arrays.asList(fakeStoreProductDtos);
    }

    public FakeStoreProductDto deleteProduct(Long id) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto> response = restTemplate
                .exchange(productUrl, HttpMethod.DELETE, null, FakeStoreProductDto.class, id);
        FakeStoreProductDto fakeStoreProductDto = response.getBody();

        return fakeStoreProductDto;
    }

    public FakeStoreProductDto updateProductById(Long id , FakeStoreProductDto productDto) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        HttpEntity<FakeStoreProductDto> requestEntity = new HttpEntity<FakeStoreProductDto>(productDto);
        ResponseEntity<FakeStoreProductDto> responseEntity =
                restTemplate.exchange(productUrl, HttpMethod.PUT, requestEntity, FakeStoreProductDto.class, id);
        FakeStoreProductDto fakeStoreProductDto = responseEntity.getBody();


        return fakeStoreProductDto;
    }
}
