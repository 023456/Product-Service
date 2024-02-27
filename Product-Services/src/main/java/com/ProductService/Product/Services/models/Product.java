package com.ProductService.Product.Services.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends BaseModel {
     private String title;
     private String description;
     private String image;
     private int inventoryCount;
     @ManyToOne
     private Category category;

     @OneToOne(cascade = {CascadeType.REMOVE , CascadeType.MERGE })
             private Price price;

}
