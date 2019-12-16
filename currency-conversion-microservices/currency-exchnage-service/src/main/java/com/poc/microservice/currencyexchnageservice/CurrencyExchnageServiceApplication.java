package com.poc.microservice.currencyexchnageservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyExchnageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchnageServiceApplication.class, args);
	}

}
