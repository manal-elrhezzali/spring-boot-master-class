package com.example.springBootMasterClass.customer;

import com.example.springBootMasterClass.infoapp.InfoApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class CustomerConfiguration {

  @Value("${app.useFakeCustomerRepo:false}")
  private Boolean useFakeCustomerRepo;

  @Value("${info.company.name}")
  private String companyName;

  //field injection is not recommended
  //you should have a constructor and then
  //inject the field
  @Autowired
  private Environment environment;

  @Bean
  CommandLineRunner commandLineRunner(InfoApp infoApp) {
    return args -> {
      System.out.println("Command Line Runner");
      System.out.println("********* "+ companyName + " *********");
      System.out.println(environment.getProperty("info.company.name"));
      System.out.println(infoApp);

    };
  }

  @Bean
  CustomerRepo customerRepo() {
    System.out.println("********* useFakeCustomerRepo = " + useFakeCustomerRepo + "*********");
    return new CustomerFakeRepo();
  }
}
