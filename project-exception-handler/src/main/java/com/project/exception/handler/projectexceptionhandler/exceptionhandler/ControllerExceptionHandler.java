package com.project.exception.handler.projectexceptionhandler.exceptionhandler;

import java.util.Date;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@RestController
@ControllerAdvice
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler
{
	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<ControllerExceptionMessage> handleException(EntityNotFoundException ex,WebRequest req)
	{
		ControllerExceptionMessage response=new ControllerExceptionMessage
				(req.getDescription(false),ex.getMessage(),new Date());
		return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
		
		
	}
	
}
