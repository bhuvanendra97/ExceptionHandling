package com.project.exception.handler.projectexceptionhandler.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.exception.handler.projectexceptionhandler.model.ProjectDetails;
import com.project.exception.handler.projectexceptionhandler.repository.RepositoryInterface;


@RestController
public class ProjectController 
{
	@Autowired
	RepositoryInterface repositoryInterface;
	

	
	
	
	
	@PostMapping("/postProjects")
	public ProjectDetails postProjectsDet(@RequestBody ProjectDetails projectDetails)
	{
		return  repositoryInterface.save(projectDetails);
	}
	
	@GetMapping("/getProjects")
	public Iterable<ProjectDetails> getProjectDet()
	{
		
		
		
		return repositoryInterface.findAll();
	}
	
	
	@GetMapping("/getSpecificTeam/{id}")
	public ProjectDetails getSpecificTeamDet(@PathVariable int id)
	{
		
		
		
		return repositoryInterface.findById(id);
	}
	
}
