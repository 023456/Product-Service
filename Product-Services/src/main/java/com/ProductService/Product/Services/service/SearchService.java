package com.ProductService.Product.Services.service;

import com.ProductService.Product.Services.dtos.GenericProductDto;
import com.ProductService.Product.Services.models.Product;
import com.ProductService.Product.Services.repositories.ProductRepo;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.*;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {
    private ProductRepo productRepo;

    public SearchService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Page<GenericProductDto> search(String query, int pageNumber, int pageSize){
//              String Sorting = "asc" or "desc";
//              if(Sorting.equals("asc")){
//                  Sort sort = Sort.by("title").ascending();
//              }
//              else{
//                  Sort sort = Sort.by("title").descending();
//              }
       Sort sort = Sort.by("title").ascending().and(Sort.by("inventory_count").descending());

        Pageable pageable = PageRequest.of(pageNumber, pageSize,sort);
        //Page<Product> productPage = productRepo.findAllByTitle(query, pageable);
        Page<Product> productPage = productRepo.findAllByTitleContaining(query, pageable);
        List<Product> products = productPage.get().toList();
        List<GenericProductDto> requestDtos = new ArrayList<>();
        for (Product product : products) {
            requestDtos.add(mapProductToDto(product));
        }
        Page<GenericProductDto> genericProductDtoPage = new PageImpl<GenericProductDto>(requestDtos, productPage.getPageable(), productPage.getTotalElements());
        return genericProductDtoPage;

}

            public GenericProductDto mapProductToDto(Product product) {
                GenericProductDto genericProductDto = new GenericProductDto();
                genericProductDto.setTitle(product.getTitle());
                genericProductDto.setDescription(product.getDescription());
                genericProductDto.setImage(product.getImage());
               return genericProductDto;
            }
}
