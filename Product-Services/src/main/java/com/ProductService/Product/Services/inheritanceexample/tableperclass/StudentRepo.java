package com.ProductService.Product.Services.inheritanceexample.tableperclass;

import com.ProductService.Product.Services.inheritanceexample.tableperclass.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("tpc_student_repo")
public interface StudentRepo extends JpaRepository<Student,Long> {
    @Override
    Student save(Student student);

}

