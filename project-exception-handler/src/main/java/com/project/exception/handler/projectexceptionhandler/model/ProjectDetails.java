package com.project.exception.handler.projectexceptionhandler.model;

import javax.persistence.Access;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.RestController;



@Entity


@Table(name = "ProjectDetails")

public class ProjectDetails
{	
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	
	private String teamName;
	



	private String projectName;
	
	
	private String testSuiteName;

	public ProjectDetails()
	{
		super();
		
	}

	public ProjectDetails(int id, String teamName, String projectName, String testSuiteName) {
		super();
		Id = id;
		this.teamName = teamName;
		this.projectName = projectName;
		this.testSuiteName = testSuiteName;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getTestSuiteName() {
		return testSuiteName;
	}

	public void setTestSuiteName(String testSuiteName) {
		this.testSuiteName = testSuiteName;
	}
	
	@Override
	public String toString() {
		return "ProjectDetails [Id=" + Id + ", teamName=" + teamName + ", projectName=" + projectName
				+ ", testSuiteName=" + testSuiteName + "]";
	}
	
}
