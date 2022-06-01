package com.example.springBootMasterClass.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Primary
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
