package com.doctorcoding.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.doctorcoding.service.CatService;

@Configuration
public class CatAppConfig {
	
	@Bean
	public CatService catService() {
		return new CatService();
	}
}
