package com.example.springBootMasterClass.customer;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Repository(value = "fake")
public class CustomerFakeRepo implements CustomerRepo{

  @Override
  public List<Customer> getCustomers() {
    return Arrays.asList(
        new Customer(1L, "Manal Rzzl"),
        new Customer(2L, "Hiba Rzzl")
    );
  }
}
