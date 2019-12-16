package com.poc.microservice.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.microservice.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration getLimitConfiguration() {
		
		return new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum());
	}
	
	@GetMapping("/limits/qa")
	public LimitConfiguration getLimitConfiguratione() {
		
		return new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum());
	}
}
