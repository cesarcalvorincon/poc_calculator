package com.sanitas.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanitas.calculator.dto.OperationResult;
import com.sanitas.calculator.service.CalculatorAPI;

/**
 * Rest service for calculator
 * @author cesar
 *
 */

@RestController
@RequestMapping("/api/v1")
public class CalculatorController {
	
	private static final String API_VERSION = "1.0";

	@Autowired
	private CalculatorAPI calculatorAPI;
	
	/**
	 * Return the API version
	 *
	 * @return the list
	 */
	@GetMapping("/sum/version")
	public ResponseEntity<String> version() {
		String version = API_VERSION;
		return ResponseEntity.ok(version);
	}  	
	
	/**
	 * Perform the operation param1 + param2
	 * 
	 * @param param1
	 * @param param2
	 * @return
	 * 
	 * Example: {"value":2.2}
	 */
	@GetMapping("/add")
	public ResponseEntity<OperationResult> add(@RequestParam(value = "param1") Double param1, @RequestParam(value = "param2") Double param2) {

		double result = calculatorAPI.add(param1, param2);

		OperationResult operationResult = new OperationResult(result);

		return ResponseEntity.ok(operationResult);
	}	
	
	/**
	 * Perform the operation param1 - param2
	 * 
	 * @param param1
	 * @param param2
	 * @return
	 * 
	 * Example: {"value":2.2}
	 */
	@GetMapping("/subtract")
	public ResponseEntity<OperationResult> subtract(@RequestParam(value = "param1") Double param1, @RequestParam(value = "param2") Double param2) {

		double result = calculatorAPI.subtract(param1, param2);

		OperationResult operationResult = new OperationResult(result);

		return ResponseEntity.ok(operationResult);
	}  	
}
