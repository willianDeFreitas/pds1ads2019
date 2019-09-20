package com.educandoweb.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String msg) {
		super(msg);
	}

	public ResourceNotFoundException(Object id) {
		super("Resource not found. Id " + id);
	}
}
