package com.ProductService.Product.Services.security;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class JwtData {
    private String email;
    private List<String> roles;


}
