package com.example.springBootMasterClass.customer;

import java.util.List;
import org.springframework.stereotype.Repository;

public interface CustomerRepo {
  List<Customer> getCustomers();


}
