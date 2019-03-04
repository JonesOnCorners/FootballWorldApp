package com.footballworld.footballapp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.footballworld.exceptions.ErrorResponse;
import com.footballworld.exceptions.PlayerNotFound;
import com.footballworld.exceptions.RestResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends RestResponseEntityExceptionHandler {
	
	@ExceptionHandler(PlayerNotFound.class)
	public ResponseEntity<ErrorResponse> playerExceptionHandler(Exception ex) {
		ErrorResponse error = new ErrorResponse();
		error.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		error.setMessage("Please contact your players");
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);
	}

	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {
		ErrorResponse error = new ErrorResponse();
		error.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		error.setMessage("Please contact your administrator");
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);
	}


}
