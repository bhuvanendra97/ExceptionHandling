package com.projectdetails.exception.handler.projectdetailsexceptionhandler.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class ProjectDetailsModel
{
	@Id
	@GeneratedValue
	private Long Id;
	
	
	private String teamName;
	



	private String projectName;
	
	
	private String testSuiteName;

	
	public ProjectDetailsModel()
	{
		super();
	}

	public ProjectDetailsModel(Long id, String teamName, String projectName, String testSuiteName) {
		super();
		Id = id;
		this.teamName = teamName;
		this.projectName = projectName;
		this.testSuiteName = testSuiteName;
	}


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
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


//	@Override
//	public String toString() {
//		return "ProjectDetailsModel [Id=" + Id + ", teamName=" + teamName + ", projectName=" + projectName
//				+ ", testSuiteName=" + testSuiteName + "]";
//	}
	
	
	
	
}
