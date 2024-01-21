package com.ProductService.Product.Services.inheritanceexample.joinedtable;

import com.ProductService.Product.Services.inheritanceexample.tableperclass.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("jt_student_repo")
public interface StudentRepo extends JpaRepository<Student,Long> {
    @Override
    Student save(Student student);

}

