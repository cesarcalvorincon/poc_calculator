package com.sanitas.calculator.service;

/**
 * Defines the API for the calculator
 * @author cesar
 *
 */
public interface CalculatorAPI {
	
	/**
	 * Add the parameters
	 * @param param1
	 * @param param2
	 * @return param1 + param2
	 */
	public double add(double param1, double param2);
	
	
	/**
	 * Subtract the parameters
	 * @param minuend
	 * @param subtrahend
	 * @return minuend - subtrahend
	 */
	public double subtract(double minuend, double subtrahend);

}