package com.example.springBootMasterClass.customer;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

  private final CustomerRepo customerRepo;

  @Autowired
  public CustomerService(
      //specifies that we want to inject the implementation CustomerFakeRepo
      @Qualifier("fake") CustomerRepo customerRepo) {
    this.customerRepo = customerRepo;
  }

  List<Customer> getCustomers() {
    return customerRepo.getCustomers();
  }
}
