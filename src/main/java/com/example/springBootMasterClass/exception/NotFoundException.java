package com.example.springBootMasterClass.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//this allows us to change the status code
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException{

  public NotFoundException(String message) {
    super(message);
  }
}
