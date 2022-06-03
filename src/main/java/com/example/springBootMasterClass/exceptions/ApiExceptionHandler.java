package com.example.springBootMasterClass.exceptions;

import java.time.ZonedDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// this allows this class to work across all the
// controllers that we have => the class can have more than one handler
@ControllerAdvice
//this class is where we handle exceptions
public class ApiExceptionHandler {

//  private final static Logger LOGGER = LoggerFactory.getLogger(ApiExceptionHandler.class);

  // we can pass multiple exceptions like value = {....}
  // we passed ApiRequestException which means
  // the class we passed to the annotation has to match the
  // one passed to the method handleApiRequestException
  // and that's the one we're going to handle
  @ExceptionHandler(value = ApiRequestException.class)
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

  @ExceptionHandler(value = NotFoundException.class)
  public ResponseEntity<Object> handleApiRequestException(
      //this is what the client for this method passes
      NotFoundException e
  ) {
    ApiException apiException = new ApiException(
        e.getMessage(),
        e,
        HttpStatus.NOT_FOUND,
        ZonedDateTime.now()
    );
    return new ResponseEntity<>(
        apiException,
        HttpStatus.NOT_FOUND);
  }

}
