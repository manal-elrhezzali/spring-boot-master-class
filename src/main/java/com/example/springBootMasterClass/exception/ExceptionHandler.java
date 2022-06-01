package com.example.springBootMasterClass.exception;

import java.time.ZonedDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

//this class is where we handle exceptions
public class ExceptionHandler {
  public ResponseEntity<Object> handleApiRequestException(
      //this is what the client for this method passes
      ApiRequestException e
  ) {
    ApiException apiException = new ApiException(
        e.getMessage(),
        e,
        HttpStatus.BAD_REQUEST,
        ZonedDateTime.now()
    );
    return new ResponseEntity<>(
        apiException,
        HttpStatus.BAD_REQUEST);
  }
}
