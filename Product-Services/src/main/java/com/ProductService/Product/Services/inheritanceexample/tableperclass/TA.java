package com.ProductService.Product.Services.inheritanceexample.tableperclass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity(name ="tpc_ta")
public class TA extends User {
    private String start_time;
    private String end_time;
}
