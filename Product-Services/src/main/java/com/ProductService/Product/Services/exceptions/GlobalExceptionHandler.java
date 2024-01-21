package com.ProductService.Product.Services.exceptions;

import com.ProductService.Product.Services.dtos.ExceptionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ExceptionDto> handleNotFoundException(NotFoundException notFoundException){
      return new ResponseEntity<>(new ExceptionDto(HttpStatus.NOT_FOUND ,notFoundException.getMessage()),HttpStatus.NOT_FOUND);
    }




}
