package com.ProductService.Product.Services.repositories;

import com.ProductService.Product.Services.models.Price;
import com.ProductService.Product.Services.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface PriceRepo extends JpaRepository<Price, UUID> {
    @Override
    Optional<Price> findById(UUID uuid );

    @Override
    Price save(Price price);
}
