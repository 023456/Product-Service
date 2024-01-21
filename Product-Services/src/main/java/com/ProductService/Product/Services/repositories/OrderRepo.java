package com.ProductService.Product.Services.repositories;

import com.ProductService.Product.Services.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderRepo extends JpaRepository<Orders, UUID> {
}
