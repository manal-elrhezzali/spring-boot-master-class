package com.example.springBootMasterClass.customer;

import java.util.Arrays;
import java.util.List;

//@Repository(value = "fake")
public class CustomerFakeRepo implements CustomerRepo{

  @Override
  public List<Customer> getCustomers() {
    return Arrays.asList(
        new Customer(1L, "Manal Rzzl", "123password", "email@gmail.com"),
        new Customer(2L, "Hiba Rzzl", "password123", "email@gmail.com")
    );
  }
}
