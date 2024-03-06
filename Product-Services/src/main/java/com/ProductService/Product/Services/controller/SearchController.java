package com.ProductService.Product.Services.controller;

import com.ProductService.Product.Services.dtos.GenericProductDto;
import com.ProductService.Product.Services.dtos.SearchRequestDto;
import com.ProductService.Product.Services.service.SearchService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchController {
    private SearchService searchService;
    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }



    @PostMapping
    public Page<GenericProductDto> search(@RequestBody SearchRequestDto searchRequestDto) {
     return searchService.search(searchRequestDto.getQuery(), searchRequestDto.getPageNumber(), searchRequestDto.getPageSize());
    }


}
