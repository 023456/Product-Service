package com.ProductService.Product.Services.inheritanceexample.joinedtable;

import com.ProductService.Product.Services.inheritanceexample.joinedtable.User;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity(name ="jt_ta")
public class TA extends User {
    private String start_time;
    private String end_time;
}
