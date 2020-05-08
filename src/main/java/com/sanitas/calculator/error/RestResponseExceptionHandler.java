package com.sanitas.calculator.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Handle exception to return a better error response
 * @author cesar
 *
 */
@ControllerAdvice
public class RestResponseExceptionHandler extends ResponseEntityExceptionHandler {

	/**
	 * We have an arithmetic error, so we can send detailed information
	 * 
	 * @param ex
	 * @param request
	 * @return
	 */
	@ExceptionHandler(value = { OperationException.class })
	protected ResponseEntity<Object> handleOperationException(OperationException ex, WebRequest request) {

		ErrorResult errorResult = new ErrorResult(ex.getCode(), ex.getMessage());
		return ResponseEntity.badRequest().body(errorResult);
	}	

	/**
	 * Default handler
	 * 
	 * @param ex
	 * @param request
	 * @return
	 */
	@ExceptionHandler(value = { RuntimeException.class })
	protected ResponseEntity<Object> handleConflict(RuntimeException ex, WebRequest request) {
		
		ErrorResult errorResult = new ErrorResult(ErrorCodes.KNOW, ex.toString());
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResult);		
	}



}
