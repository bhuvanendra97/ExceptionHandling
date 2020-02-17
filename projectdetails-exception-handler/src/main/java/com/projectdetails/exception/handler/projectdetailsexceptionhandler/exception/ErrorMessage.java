package com.projectdetails.exception.handler.projectdetailsexceptionhandler.exception;

import org.springframework.web.bind.annotation.RestController;

@RestController
public  final class ErrorMessage 
{
	public static String fieldNull="Team Name or Project Name or Test Suite Name NOT FOUND";
	public static String emptyRecord="No Records FOUND";
}
