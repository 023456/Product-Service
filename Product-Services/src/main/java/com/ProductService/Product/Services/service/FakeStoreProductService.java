package com.ProductService.Product.Services.service;

import com.ProductService.Product.Services.thirdpartyclients.FakeStoreProductClient;
import com.ProductService.Product.Services.thirdpartyclients.dto.FakeStoreProductDto;
import com.ProductService.Product.Services.dtos.GenericProductDto;
import com.ProductService.Product.Services.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service("fakeStoreProductService")
public class FakeStoreProductService implements ProductService{
    private FakeStoreProductClient fakeStoreProductClient;

    @Autowired
    public FakeStoreProductService(FakeStoreProductClient fakeStoreProductClient) {
        this.fakeStoreProductClient = fakeStoreProductClient;
    }

    public GenericProductDto convertFakeStoreDtoToGenericProductDto(FakeStoreProductDto fakeStoreProductDto){
        GenericProductDto genericProductDto = new GenericProductDto();

        genericProductDto.setCategory(fakeStoreProductDto.getCategory());
        genericProductDto.setId(fakeStoreProductDto.getId());
        genericProductDto.setDescription(fakeStoreProductDto.getDescription());
        genericProductDto.setImage(fakeStoreProductDto.getImage());
        genericProductDto.setTitle(fakeStoreProductDto.getTitle());
        genericProductDto.setPrice(fakeStoreProductDto.getPrice());
        return genericProductDto;
    }
    @Override
    public GenericProductDto getProductById(Long id) throws NotFoundException {
       return convertFakeStoreDtoToGenericProductDto(fakeStoreProductClient.getProductById(id));
    }

    @Override
    public GenericProductDto createProduct(GenericProductDto productDto) {

        GenericProductDto genericProductDto = convertFakeStoreDtoToGenericProductDto(fakeStoreProductClient.createProduct(productDto));
        return genericProductDto;

    }
    @Override
    public List<GenericProductDto> getAllProducts() {
        List<FakeStoreProductDto> fakeStoreProductDtos =
                fakeStoreProductClient.getAllProducts();

        List<GenericProductDto> genericProductDtos = new ArrayList<>();
        for(FakeStoreProductDto fakeStoreProductDto: fakeStoreProductDtos) {
            GenericProductDto genericProductDto = convertFakeStoreDtoToGenericProductDto(fakeStoreProductDto);

            genericProductDtos.add(genericProductDto);
        }
        return genericProductDtos;
    }

    @Override
    public GenericProductDto deleteProduct(Long id) {
        return convertFakeStoreDtoToGenericProductDto(fakeStoreProductClient.deleteProduct(id));

    }

    @Override
    public GenericProductDto updateProductById(Long id , GenericProductDto productDto) {
        FakeStoreProductDto fakeStoreProductDto = new FakeStoreProductDto();
        fakeStoreProductDto.setCategory(productDto.getCategory());
        fakeStoreProductDto.setDescription(productDto.getDescription());
        fakeStoreProductDto.setImage(productDto.getImage());
        fakeStoreProductDto.setPrice(productDto.getPrice());
        fakeStoreProductDto.setTitle(productDto.getTitle());

      return convertFakeStoreDtoToGenericProductDto(fakeStoreProductClient.updateProductById(id,fakeStoreProductDto));


    }
}
