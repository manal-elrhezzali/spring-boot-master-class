package com.example.springBootMasterClass.customer;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
//@Primary
public class CustomerRepository implements CustomerRepo{

  @Override
  public List<Customer> getCustomers() {
    //TODO: connect to a real DB
//    return Collections.emptyList();
    return Arrays.asList(
        new Customer(1L, "aya Rzzl", "456password", "email@gmail.com"),
        new Customer(2L, "mohammed Rzzl","password456", "email@gmail.com")
    );
  }
}
