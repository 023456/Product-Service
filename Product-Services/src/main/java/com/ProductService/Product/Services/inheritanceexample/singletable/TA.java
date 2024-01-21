package com.ProductService.Product.Services.inheritanceexample.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity(name ="st_ta")
@DiscriminatorValue(value = "3")
public class TA extends User {
    private String start_time;
    private String end_time;
}
