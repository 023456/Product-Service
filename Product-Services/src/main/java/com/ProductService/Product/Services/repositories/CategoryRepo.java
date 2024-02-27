package com.ProductService.Product.Services.repositories;

import com.ProductService.Product.Services.models.Category;
import com.ProductService.Product.Services.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository
public interface CategoryRepo extends JpaRepository<Category, UUID> {
    @Override
    Optional<Category> findById(UUID uuid );

    @Override
    Category save(Category category);


   Optional<Category> findByName(String name);


}
