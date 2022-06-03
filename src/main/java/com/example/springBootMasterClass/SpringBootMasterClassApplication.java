package com.example.springBootMasterClass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
//to enable feign clients
@EnableFeignClients
public class SpringBootMasterClassApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMasterClassApplication.class, args);
	}
}
