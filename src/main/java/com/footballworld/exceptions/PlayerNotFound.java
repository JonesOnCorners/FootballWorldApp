package com.footballworld.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


public class PlayerNotFound extends Exception {

	private static final long serialVersionUID = 100L;
	
	 
	    private String errorMessage;
	  
	    public String getErrorMessage() {
	        return errorMessage;
	    }
	    public PlayerNotFound(String errorMessage) {
	        super(errorMessage);
	        this.errorMessage = errorMessage;
	    }
	    public PlayerNotFound() {
	        super();
	    }
	
}
