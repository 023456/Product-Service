package com.ProductService.Product.Services.inheritanceexample.tableperclass;



import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name ="tpc_mentor")
public class Mentor extends User {
    private double avg_rating;
}
