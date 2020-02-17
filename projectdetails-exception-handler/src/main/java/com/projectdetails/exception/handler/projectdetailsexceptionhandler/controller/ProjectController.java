package com.projectdetails.exception.handler.projectdetailsexceptionhandler.controller;

import java.sql.SQLException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.projectdetails.exception.handler.projectdetailsexceptionhandler.exception.ErrorMessage;
import com.projectdetails.exception.handler.projectdetailsexceptionhandler.exception.ResourceNotFoundException;
import com.projectdetails.exception.handler.projectdetailsexceptionhandler.model.ProjectDetailsModel;
import com.projectdetails.exception.handler.projectdetailsexceptionhandler.repository.RepositoryInterface;
@ControllerAdvice
@RestController
public class ProjectController  {

	@Autowired
	RepositoryInterface repositoryInterface;
	
	@Autowired
	ErrorMessage errorMessage;
	
	
	@PostMapping(value="/postProjects")
	public ResponseEntity postProject(@RequestBody ProjectDetailsModel projectDetailsModel ) throws ResourceNotFoundException,SQLException
	{
		ProjectDetailsModel project=repositoryInterface.save(projectDetailsModel);
		
		if(projectDetailsModel.getProjectName()==null || projectDetailsModel.getTeamName()==null 
				||projectDetailsModel.getTestSuiteName()==null)
		{
			throw new ResourceNotFoundException(errorMessage.fieldNull);
		}
		
		return new ResponseEntity(HttpStatus.OK);
		
	}
	
	@GetMapping("/projects")
	public Iterable<ProjectDetailsModel> getProject() throws SQLException {

		Iterable<ProjectDetailsModel> project = repositoryInterface.findAll();
	
		System.out.println();
		if (project.toString().length()==2) {
			System.out.println("entered");
			throw new SQLException(errorMessage.emptyRecord);
		}
		return project;
	}
	@GetMapping(value = "/project/{id}")
	public Optional<ProjectDetailsModel> getSpecificProject(@PathVariable Long id) throws ResourceNotFoundException  {

		Optional<ProjectDetailsModel> project = repositoryInterface.findById(id);
		if (project == null) 
		{
			throw new ResourceNotFoundException(errorMessage.emptyRecord);
		}
		return project;
	}

	
	@ExceptionHandler(ResourceNotFoundException.class)
	@DeleteMapping("/delete/{id}")
	public void deleteSepcifiedProject(@PathVariable Long id)
	{
	
		repositoryInterface.deleteById(id);
		
		

	}
	@GetMapping("/project")
	public String ExceptionResolver()
	{
		Iterable<ProjectDetailsModel> project = repositoryInterface.findAll();
		
		System.out.println();
		if (project.toString().length()==2) {
			System.out.println("entered");

		}

		return "haha";
	}

}
