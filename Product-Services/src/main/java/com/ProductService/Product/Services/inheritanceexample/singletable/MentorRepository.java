package com.ProductService.Product.Services.inheritanceexample.singletable;

import com.ProductService.Product.Services.inheritanceexample.singletable.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MentorRepository extends JpaRepository<Mentor,Long> {

}
