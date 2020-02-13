package com.project.exception.handler.projectexceptionhandler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.project.exception.handler.projectexceptionhandler.model.ProjectDetails;


@RestController
@Repository
public interface RepositoryInterface  extends CrudRepository<ProjectDetails, Integer>
{
	ProjectDetails findById(int id);

}
