package com.projectdetails.exception.handler.projectdetailsexceptionhandler.exception;

public class ExceptionResponse {

	
	private int statusCode;
	private String errorMessage;
	private String requestedURI;

	public int getStatusCode()
	{
		return statusCode;
	}
	public void setStatusCode(final int statusCode)
	{
		this.statusCode=statusCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(final String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getRequestedURI() {
		return requestedURI;
	}

	public void callerURL(final String requestedURI) {
		this.requestedURI = requestedURI;
	}
}
