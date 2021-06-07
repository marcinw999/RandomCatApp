package com.doctorcoding.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.doctorcoding.config.CatAppConfig;
import com.doctorcoding.service.CatService;

@SpringBootApplication
public class RandomCatAppApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(RandomCatAppApplication.class);
	
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				CatAppConfig.class)) {

			CatService catService = applicationContext.getBean(CatService.class);

			LOGGER.info("CatService -> {}", catService);
		}
	}
}
