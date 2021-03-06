package com.example.springBootMasterClass.customer;

import com.example.springBootMasterClass.exceptions.ApiRequestException;
import java.util.List;
import javax.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "api/v2/customers")
@RestController
@AllArgsConstructor
public class CustomerControllerV2 {

  private final CustomerService customerService;

//  @Autowired
//  public CustomerControllerV2(
//      CustomerService customerService) {
//    this.customerService = customerService;
//  }

  @GetMapping
  List<Customer> getCustomers() {
    return customerService.getCustomers();
  }

  @GetMapping(path = "{customerId}")
  Customer getCustomer(@PathVariable("customerId") Long id) {
    return customerService.getCustomer(id);
  }

  @GetMapping(path = "{customerId}/exception")
  Customer getCustomerException(@PathVariable("customerId") Long id) {
    throw new ApiRequestException(
        "ApiRequestException for customer " + id
    );
  }

  @PostMapping
  void createNewCustomer( @Valid @RequestBody Customer customer) {
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
