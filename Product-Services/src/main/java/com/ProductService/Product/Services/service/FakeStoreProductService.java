package com.ProductService.Product.Services.service;

import com.ProductService.Product.Services.models.Product;
import com.ProductService.Product.Services.thirdpartyclients.FakeStoreProductClient;
import com.ProductService.Product.Services.thirdpartyclients.dto.FakeStoreProductDto;
import com.ProductService.Product.Services.dtos.GenericProductDto;
import com.ProductService.Product.Services.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service("fakeStoreProductService")
public class FakeStoreProductService implements ProductServiceFakeStore {
    private FakeStoreProductClient fakeStoreProductClient;

    private RedisTemplate<String, Object> redisTemplate;

    @Autowired
    public FakeStoreProductService(FakeStoreProductClient fakeStoreProductClient , RedisTemplate<String, Object> redisTemplate) {
        this.fakeStoreProductClient = fakeStoreProductClient;
        this.redisTemplate = redisTemplate;

    }

    public GenericProductDto convertFakeStoreDtoToGenericProductDto(FakeStoreProductDto fakeStoreProductDto) {
        GenericProductDto genericProductDto = new GenericProductDto();

        genericProductDto.setCategory(fakeStoreProductDto.getCategory());
        genericProductDto.setDescription(fakeStoreProductDto.getDescription());
        genericProductDto.setImage(fakeStoreProductDto.getImage());
        genericProductDto.setTitle(fakeStoreProductDto.getTitle());
        genericProductDto.setPriceValue(fakeStoreProductDto.getPriceValue());
        genericProductDto.setPriceCurrency(fakeStoreProductDto.getPriceCurrency());
        return genericProductDto;
    }



    @Override
    public GenericProductDto getProductById(Long id) throws NotFoundException {
        GenericProductDto genericProductDtoFromCache = (GenericProductDto) redisTemplate.opsForValue().get(String.valueOf(id));
        if(genericProductDtoFromCache != null){
            return genericProductDtoFromCache;
        }

        GenericProductDto genericProductDto = convertFakeStoreDtoToGenericProductDto(fakeStoreProductClient.getProductById(id));
        redisTemplate.opsForValue().set(String.valueOf(id),genericProductDto);
        return genericProductDto;

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
        for (FakeStoreProductDto fakeStoreProductDto : fakeStoreProductDtos) {
            GenericProductDto genericProductDto = convertFakeStoreDtoToGenericProductDto(fakeStoreProductDto);

            genericProductDtos.add(genericProductDto);
        }
        return genericProductDtos;
    }

    @Override
    public GenericProductDto deleteProduct(long id) throws NotFoundException {
        return null;
    }

    @Override
    public GenericProductDto deleteProduct(Long id) throws NotFoundException{
        return convertFakeStoreDtoToGenericProductDto(fakeStoreProductClient.deleteProduct(id));

    }

    @Override
    public GenericProductDto updateProductById(Long id, GenericProductDto productDto) throws NotFoundException {
        FakeStoreProductDto fakeStoreProductDto = new FakeStoreProductDto();
        fakeStoreProductDto.setCategory(productDto.getCategory());
        fakeStoreProductDto.setDescription(productDto.getDescription());
        fakeStoreProductDto.setImage(productDto.getImage());
        fakeStoreProductDto.setPriceValue(productDto.getPriceValue());
        fakeStoreProductDto.setPriceCurrency(productDto.getPriceCurrency());
        fakeStoreProductDto.setTitle(productDto.getTitle());

        return convertFakeStoreDtoToGenericProductDto(fakeStoreProductClient.updateProductById(id, fakeStoreProductDto));
    }

    public List<Product> getProductByCategory(UUID categoryId) throws NotFoundException {
        return null;
    }
}


