package com.example.springBootMasterClass.customer;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "api/v1/customer")
@RestController
public class CustomerController {

  private final CustomerService customerService;

  @Autowired
  public CustomerController(
      CustomerService customerService) {
    this.customerService = customerService;
  }

  @GetMapping(value = "all")
  List<Customer> getCustomer() {
    return customerService.getCustomers();
  }

  @PostMapping
  void createNewCustomer(@RequestBody Customer customer) {
    System.out.println("POST REQUEST....");
    System.out.println(customer);
  }

  @DeleteMapping(path = "{customerId}")
  void deleteUser(@PathVariable("customerId") Long id) {
    System.out.println("Delete REQUEST....");
    System.out.println(id);
  }

  @PutMapping
  void updateCustomer(@RequestBody Customer customer) {
    System.out.println("UPDATE REQUEST....");
    System.out.println(customer);
  }
}
