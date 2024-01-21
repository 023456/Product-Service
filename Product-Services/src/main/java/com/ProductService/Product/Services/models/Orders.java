package com.ProductService.Product.Services.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name ="orders")
public class Orders extends BaseModel{
    @ManyToMany(cascade = CascadeType.ALL)
            @JoinTable(
                    name = "products_orders",
                    joinColumns = @JoinColumn(name = "orderIdssss"),
                    inverseJoinColumns = @JoinColumn(name = "productIdssss")
            )
    private List<Product> productList;
}
