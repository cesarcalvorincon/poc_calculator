package com.sanitas.calculator.error;

/**
 * Exception used when the operation cannot be performed
 * @author cesar
 *
 */
public class OperationException extends RuntimeException {

	private static final long serialVersionUID = 6317058183950162389L;
	
	private ErrorCodes code;
	private String message;

	public OperationException(ErrorCodes code, String message) {
		super(message);
		this.code = code;
		this.message = message;		
	}

	public OperationException(ErrorCodes code, String message, Throwable cause) {
		super(message, cause);
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
