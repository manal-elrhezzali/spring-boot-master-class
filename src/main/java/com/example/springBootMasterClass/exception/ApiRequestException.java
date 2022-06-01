package com.example.springBootMasterClass.exception;

//this is what we're going to throw from our code
public class ApiRequestException extends RuntimeException{

  public ApiRequestException(String message) {
    super(message);
  }

  public ApiRequestException(String message, Throwable cause) {
    super(message, cause);
  }
}
