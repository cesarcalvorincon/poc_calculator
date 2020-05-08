package com.sanitas.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sanitas.calculator.service.CalculatorAPI;
import com.sanitas.calculator.service.CalculatorImpl;

import io.corp.calculator.TracerImpl;

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
    
	//TODO We should return TracerAPI instead TracerImpl, but TracerImpl does not implement TracerAPI. Is it a bug in tracer-1.0.0 library?
    @Bean
    public TracerImpl getTracerAPI() {
        return new TracerImpl();
    }	    
}
