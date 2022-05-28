package com.example.springBootMasterClass.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

  private  CustomerService customerService;

//  @Autowired
  public CustomerController() {
//    this.customerService = customerService;
    customerService = new CustomerService();
  }

  @GetMapping
  Customer getCustomer() {
    return customerService.getCustomer();
  }
}
