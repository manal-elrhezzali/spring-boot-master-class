package com.example.springBootMasterClass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class SpringBootMasterClassApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMasterClassApplication.class, args);
	}

	@GetMapping
	Customer getCustomer() {
		return new Customer(1L, "Manal Rzzl");
	}

	class Customer {
		private final Long id;
		private final String name;

		public Customer(Long id, String name) {
			this.id = id;
			this.name = name;
		}

		public Long getId() {
			return id;
		}

		public String getName() {
			return name;
		}
	}
}
