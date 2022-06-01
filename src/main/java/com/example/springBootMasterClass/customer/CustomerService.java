package com.example.springBootMasterClass.customer;

import com.example.springBootMasterClass.exceptions.NotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

  //  private final CustomerRepo customerRepo;
  private final CustomerRepository customerRepository;

  @Autowired
  public CustomerService(
      //specifies that we want to inject the implementation CustomerFakeRepo
      CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  List<Customer> getCustomers() {
    return customerRepository.findAll();
  }

  Customer getCustomer(Long id) {
    return customerRepository.findById(id)
        .orElseThrow(() -> new NotFoundException("customer with id " + id + " not found"));
  }
}
