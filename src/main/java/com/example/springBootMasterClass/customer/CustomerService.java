package com.example.springBootMasterClass.customer;

import com.example.springBootMasterClass.exceptions.NotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

  private final CustomerRepo customerRepo;

  @Autowired
  public CustomerService(
      //specifies that we want to inject the implementation CustomerFakeRepo
       CustomerRepo customerRepo) {
    this.customerRepo = customerRepo;
  }

  List<Customer> getCustomers() {
    return customerRepo.getCustomers();
  }

  Customer getCustomer(Long id) {
    return getCustomers()
        .stream()
        .filter(customer -> customer.getId().equals(id)).findFirst()
        .orElseThrow(() -> new NotFoundException("customer with id "+ id + " not found"));
  }
}
