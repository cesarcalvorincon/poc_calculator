package com.sanitas.calculator.model;

import com.sanitas.calculator.dto.OperationResult;

public class OperationInfo {
	
	private OperationResult operationResult;
	private OperationType operationType;
	private Double param1;
	private Double param2;
	
	public OperationInfo(OperationResult operationResult, OperationType operationType, Double param1, Double param2) {
		super();
		this.operationResult = operationResult;
		this.operationType = operationType;
		this.param1 = param1;
		this.param2 = param2;
	}

	public OperationResult getOperationResult() {
		return operationResult;
	}

	public void setOperationResult(OperationResult operationResult) {
		this.operationResult = operationResult;
	}

	public OperationType getOperationType() {
		return operationType;
	}

	public void setOperationType(OperationType operationType) {
		this.operationType = operationType;
	}

	public Double getParam1() {
		return param1;
	}

	public void setParam1(Double param1) {
		this.param1 = param1;
	}

	public Double getParam2() {
		return param2;
	}

	public void setParam2(Double param2) {
		this.param2 = param2;
	}
	
	@Override
	public String toString() {
		return String.format("Operation: %s, Param1; %f, Param2: %f, Result: %s", operationType, param1, param2, operationResult);
	}
	
	public static class OperationInfoBuilder {
		
		private OperationResult operationResult;
		private OperationType operationType;
		private Double param1;
		private Double param2;
		 
		public OperationInfoBuilder(OperationType operationType) {
			this.operationType = operationType;
		}

		public OperationInfoBuilder withValues(Double param1, Double param2) {
			this.param1 = param1;
			this.param2 = param2;
			return this;
		}
		
		public OperationInfoBuilder withResult(OperationResult operationResult) {
			this.operationResult = operationResult;
			return this;
		}		
		
		public OperationInfo build() {
			return new OperationInfo(operationResult, operationType, param1, param2);
		}
	}
	
}
