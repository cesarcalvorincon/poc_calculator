package com.sanitas.calculator.service;

/**
 * Basic implementation for the interface {@link CalculatorAPI}
 * @author cesar
 *
 */
public class CalculatorImpl implements CalculatorAPI {

	@Override
	public double add(double param1, double param2) {
		return param1 + param2;
	}

	@Override
	public double subtract(double minuend, double subtrahend) {
		return minuend - subtrahend;
	}

}
