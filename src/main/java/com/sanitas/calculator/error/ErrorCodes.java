package com.sanitas.calculator.error;

/**
 * List of error codes
 * @author cesar
 *
 */
public enum ErrorCodes {
	KNOW(1001),
	DIVISION_BY_ZERO(1002),
	INVALID_NUMBER(1003);
	
	int code;
	private ErrorCodes(int code) {
		this.code = code;
	}
}
