//package com.ProductService.Product.Services.service;
//
//import com.ProductService.Product.Services.dtos.CategoryDto;
//import com.ProductService.Product.Services.dtos.GenericProductDto;
//import com.ProductService.Product.Services.exceptions.NotFoundException;
//import com.ProductService.Product.Services.mapper.SelfProductServiceMapper;
//import com.ProductService.Product.Services.models.Category;
//import com.ProductService.Product.Services.models.Price;
//import com.ProductService.Product.Services.models.Product;
//import com.ProductService.Product.Services.repositories.CategoryRepo;
//import com.ProductService.Product.Services.repositories.PriceRepo;
//import com.ProductService.Product.Services.repositories.ProductRepo;
//import org.springframework.stereotype.Service;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//import java.util.UUID;
//
//@Service("selfProductServiceImpl")
//public class SelfProductService implements ProductService{
//
//    private ProductRepo productRepo;
//    private CategoryRepo categoryRepo;
//    private PriceRepo priceRepo;
//    private SelfProductServiceMapper mapper;
//
//
//    public SelfProductService(ProductRepo productRepo, CategoryRepo categoryRepo,
//                              PriceRepo priceRepo, SelfProductServiceMapper mapper) {
//        this.productRepo = productRepo;
//        this.categoryRepo = categoryRepo;
//        this.priceRepo = priceRepo;
//        this.mapper = mapper;
//    }
//    @Override
//    public GenericProductDto getProductById(UUID id) throws NotFoundException {
//        Optional<Product> optionalProduct = productRepo.findById(id);
//        if(optionalProduct.isEmpty()){
//            throw new NotFoundException("Product id is not present");
//        }
//        Product product = optionalProduct.get();
//        return mapper.mapProductToDto(product);
//    }
//
//    @Override
//    public Product createProduct(GenericProductDto genericProductDto) throws NotFoundException {
//      Product product = mapper.mapDtoToProduct(genericProductDto,getCategory(genericProductDto),getPrice(genericProductDto));
//        productRepo.save(product);
//        return product;
//    }
//
//    @Override
//    public List<GenericProductDto> getAllProducts() {
//        List <Product> products = productRepo.findAll();
//        List<GenericProductDto> requestDtos = new ArrayList<>();
//        for(Product product : products){
//            requestDtos.add( mapper.mapProductToDto(product));
//        }
//        return requestDtos;
//    }
//
//    @Override
//    public Product updateProductById(long id, GenericProductDto genericProductDto) throws NotFoundException {
//        Optional<Product> productOptional = productRepo.findById(id);
//        if(productOptional.isEmpty()){
//            throw new NotFoundException("Product id is not found");
//        }
//        Product product = productOptional.get();
//        product.setDescription(genericProductDto.getDescription());
//        product.setTitle(genericProductDto.getTitle());
//        Category category = getCategory(genericProductDto);
//        product.setCategory(category);
//        product.getPrice().setPrice(genericProductDto.getPriceValue());
//        product.getPrice().setCurrency(genericProductDto.getPriceCurrency());
//        product.setInventoryCount(genericProductDto.getInventoryCount());
//        productRepo.save(product);
//        return product;
//    }
//
//    @Override
//    public List<Product> getProductByCategory(UUID categoryId) throws NotFoundException {
//      Optional<Category> categoryOptional= categoryRepo.findById(categoryId);
//      if(categoryOptional.isEmpty()){
//          throw new NotFoundException("Category is not found");
//      }
//      Category category = categoryOptional.get();
//      List<Product> products = category.getProductList();
//        return products;
//    }
//
//    @Override
//    public GenericProductDto deleteProduct(Long id) throws NotFoundException {
//        Optional<Product> productOptional = productRepo.findById(id);
//        if(productOptional.isEmpty()){
//            throw new NotFoundException("Product id is not found");
//        }
//        Product product = productOptional.get();
//        productRepo.delete(product);
//        GenericProductDto deletedProductDto = new GenericProductDto(product);
//        return deletedProductDto;
//
//    }
//
//
//    private Category getCategory(GenericProductDto genericProductDto) throws NotFoundException {
//        CategoryDto categoryDto = genericProductDto.getCategory();
//        Optional<Category> optionalCategory = categoryRepo.findByName(categoryDto.getName());
//        if (optionalCategory.isEmpty()) {
//            throw new NotFoundException("Category name not found");
//        }
//        return optionalCategory.get();
//    }
//
//    private Price getPrice(GenericProductDto genericProductDto) {
//        Price price = new Price();
//        price.setPrice(genericProductDto.getPriceValue());
//        price.setCurrency(genericProductDto.getPriceCurrency());
//        priceRepo.save(price);
//        return price;
//    }
//}
