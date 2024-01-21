package com.ProductService.Product.Services.inheritanceexample.joinedtable;

import com.ProductService.Product.Services.inheritanceexample.joinedtable.User;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name ="jt_student")
public class Student extends User {
    private double psp;
    private String batch;
}
