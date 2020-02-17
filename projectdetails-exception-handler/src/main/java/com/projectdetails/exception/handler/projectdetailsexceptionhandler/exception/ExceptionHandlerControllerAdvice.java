package com.projectdetails.exception.handler.projectdetailsexceptionhandler.exception;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ExceptionHandlerControllerAdvice {

	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public @ResponseBody ExceptionResponse handleResourceNotFound(final ResourceNotFoundException exception,
			final HttpServletRequest request,WebRequest req) {

		ExceptionResponse error = new ExceptionResponse();
		error.setStatusCode(HttpStatus.NOT_FOUND.value());
		error.setErrorMessage(exception.getMessage());
		error.callerURL(request.getRequestURI());
		req.getDescription(false);

		return error;
	}

	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public @ResponseBody ExceptionResponse handleException(final Exception exception,
			final HttpServletRequest request,WebRequest req) {

		ExceptionResponse error = new ExceptionResponse();
		error.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		error.setErrorMessage(exception.getMessage());
		error.callerURL(request.getRequestURI());
		req.getDescription(false);
		return error;
	}
	
	@ExceptionHandler(SQLException.class)
	
	public @ResponseBody ExceptionResponse handleSQLException(final SQLException exception
			,final HttpServletRequest request,WebRequest req,DataAccessException excep)
	{
		ExceptionResponse error = new ExceptionResponse();
		error.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
		error.setErrorMessage(exception.getMessage());
		error.callerURL(request.getRequestURI());
		req.getDescription(false);
		return error;
	}


}
