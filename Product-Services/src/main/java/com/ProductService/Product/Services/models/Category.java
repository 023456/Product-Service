package com.ProductService.Product.Services.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.transaction.Transactional;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Transactional
public class Category extends BaseModel {
    private String name;
    @OneToMany(mappedBy = "category" ,fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Product> productList;

}
