package com.sanitas.calculator.dto;

public class OperationResult {

	private Double value;
	
	public OperationResult() {
		super();
	}
	
	public OperationResult(Double value) {
		super();
		this.value = value;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return String.format("%f", value);
	}	
	
}