package com.example.springBootMasterClass.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Customer {
  private final Long id;

  @NotBlank(message = "name must not be empty")
  private final String name;
  @NotBlank(message = "password must not be empty")
  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  private final String password;

  //not needed
  @NotBlank(message = "email must not be empty")
  @Email
  private final String email;

  Customer(Long id, String name, String password, String email) {
    this.id = id;
    this.name = name;
    this.password = password;
    this.email = email;
  }

  @JsonProperty("customerId")
  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  @JsonIgnore
  public String getPassword() {
    return password;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public String toString() {
    return "Customer{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", password='" + password + '\'' +
        ", email='" + email + '\'' +
        '}';
  }
}
