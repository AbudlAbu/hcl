package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.beans.RestaurentEntity;

@SpringBootApplication
public class SpringbootFoodApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringbootFoodApplication.class, args);
		
	
	}

}
