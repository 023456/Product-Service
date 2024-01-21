package com.ProductService.Product.Services.repositories;

import com.ProductService.Product.Services.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CategoryRepo extends JpaRepository<Category, UUID> {
}
