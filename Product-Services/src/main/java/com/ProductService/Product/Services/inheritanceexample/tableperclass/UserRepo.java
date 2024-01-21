package com.ProductService.Product.Services.inheritanceexample.tableperclass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tpc_user_repo")
public interface UserRepo extends JpaRepository<User,Long> {
    @Override
    User save(User user);
}
