package com.example.springBootMasterClass.customer;

import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class CustomerRepository implements CustomerRepo{

  @Override
  public List<Customer> getCustomers() {
    //TODO: connect to a real DB
    return Collections.emptyList();
  }
}
