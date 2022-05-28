package com.example.springBootMasterClass.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

  private final CustomerService customerService;

  @Autowired
  public CustomerController(
      CustomerService customerService) {
    this.customerService = customerService;
  }

  @GetMapping
  Customer getCustomer() {
    return new Customer(1L, "Manal Rzzl");
  }
}
