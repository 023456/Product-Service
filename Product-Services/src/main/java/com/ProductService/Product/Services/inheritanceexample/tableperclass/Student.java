package com.ProductService.Product.Services.inheritanceexample.tableperclass;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Getter
@Setter
@Entity(name ="tpc_student")
public class Student extends User {
    private double psp;
    private String batch;

}
