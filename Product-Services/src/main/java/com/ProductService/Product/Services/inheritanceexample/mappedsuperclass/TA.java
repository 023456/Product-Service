package com.ProductService.Product.Services.inheritanceexample.mappedsuperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity(name ="msc_TA")
public class TA extends User{
    private String start_time;
    private String end_time;
}
