package com.sanitas.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sanitas.calculator.service.CalculatorAPI;
import com.sanitas.calculator.service.CalculatorImpl;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

	/************* Configuration methods ****************/
    
    @Bean
    public CalculatorAPI getCalculatorAPI() {
        return new CalculatorImpl();
    }  	
}
