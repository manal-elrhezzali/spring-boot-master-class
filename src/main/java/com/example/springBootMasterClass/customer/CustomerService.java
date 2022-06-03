package com.example.springBootMasterClass.customer;

import com.example.springBootMasterClass.exceptions.NotFoundException;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class CustomerService {

//  private final static Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);
  //  private final CustomerRepo customerRepo;
  private final CustomerRepository customerRepository;

  //annotation is optional
//  @Autowired
//  public CustomerService(
      //specifies that we want to inject the implementation CustomerFakeRepo
//      CustomerRepository customerRepository) {
//    this.customerRepository = customerRepository;
//  }

  List<Customer> getCustomers() {
    log.info("getCustomers was called");
    return customerRepository.findAll();
  }

  Customer getCustomer(Long id) {
    return customerRepository.findById(id)
        .orElseThrow(() -> {
          NotFoundException notFoundException = new NotFoundException(
              "customer with id " + id + " not found");
          log.error("error in getting customer {}", id, notFoundException);
          return notFoundException;
        });
  }
}
