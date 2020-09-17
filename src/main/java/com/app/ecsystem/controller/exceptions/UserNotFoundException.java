package com.app.ecsystem.controller.exceptions;

public class UserNotFoundException extends RuntimeException{

	/**
	 * This class returns error when the user is not registered
	 */ 
	private static final long serialVersionUID = 1L;

	public UserNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public UserNotFoundException(String arg0) {
		super(arg0);
	}

	public UserNotFoundException(Throwable arg0) {
		super(arg0);
	}

}
