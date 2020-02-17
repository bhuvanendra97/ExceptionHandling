package com.projectdetails.exception.handler.projectdetailsexceptionhandler.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.stereotype.Repository;
import com.projectdetails.exception.handler.projectdetailsexceptionhandler.model.ProjectDetailsModel;


@Repository
public interface RepositoryInterface  extends CrudRepository<ProjectDetailsModel, Long>
{
//	ProjectDetailsModel findById(int id);
	
//	 @Query(value="{'_id':?0}") 
//	 ProjectDetailsModel findOneProjectDetails(String id);
//	 
//	 @Query(value="{'_id':?0}") 
//	 Optional<ProjectDetailsModel> findOneDetails(String id);
//	 
//	 @Query(value="{'_id' : ?0}", delete = true)
//	 public void deleteBy(String id);

}
