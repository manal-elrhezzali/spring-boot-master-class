package com.example.springBootMasterClass.customer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
//@Primary
public class CustomerRepository implements CustomerRepo{

  @Override
  public List<Customer> getCustomers() {
    //TODO: connect to a real DB
//    return Collections.emptyList();
    return Arrays.asList(
        new Customer(1L, "aya Rzzl", "456password"),
        new Customer(2L, "mohammed Rzzl","password456")
    );
  }
}
