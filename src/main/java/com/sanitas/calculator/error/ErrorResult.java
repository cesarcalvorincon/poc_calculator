package com.sanitas.calculator.error;

/**
 * Bean with the information when operation can not be executed
 * @author cesar
 *
 */
public class ErrorResult {
	
	private ErrorCodes code;
	private String message;
	
	public ErrorResult(ErrorCodes code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	
	
	public ErrorCodes getCode() {
		return code;
	}
	public void setCode(ErrorCodes code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
