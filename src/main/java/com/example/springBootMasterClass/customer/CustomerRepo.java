package com.example.springBootMasterClass.customer;

import java.util.List;
import org.springframework.stereotype.Repository;

//@Repository
public interface CustomerRepo {
  List<Customer> getCustomers();


}
