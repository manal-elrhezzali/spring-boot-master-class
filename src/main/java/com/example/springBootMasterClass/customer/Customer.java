package com.example.springBootMasterClass.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Customer {

  @Id
  private Long id;

  @NotBlank(message = "name must not be empty")
  private  String name;
  @NotBlank(message = "password must not be empty")
  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  private String password;

  //not needed
  @NotBlank(message = "email must not be empty")
  @Email
  private String email;

//  public Customer() {
//  }

//  Customer(Long id, String name, String password, String email) {
//    this.id = id;
//    this.name = name;
//    this.password = password;
//    this.email = email;
//  }

//  public Customer() {
//
//  }

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

//  @Override
//  public String toString() {
//    return "Customer{" +
//        "id=" + id +
//        ", name='" + name + '\'' +
//        ", password='" + password + '\'' +
//        ", email='" + email + '\'' +
//        '}';
//  }
}
