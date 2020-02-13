package com.project.exception.handler.projectexceptionhandler.exceptionhandler;

import java.util.Date;

public class ControllerExceptionMessage
{
	private String description;
	private String errorMessage;
	private Date timeStamp;
	public ControllerExceptionMessage(String description, String errorMessage, Date timeStamp) {
		super();
		this.description = description;
		this.errorMessage = errorMessage;
		this.timeStamp = timeStamp;
	}

	

}
