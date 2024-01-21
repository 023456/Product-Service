package com.ProductService.Product.Services.inheritanceexample.joinedtable;


import com.ProductService.Product.Services.inheritanceexample.joinedtable.User;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name ="jt_mentor")
public class Mentor extends User {
    private double avg_rating;
}
