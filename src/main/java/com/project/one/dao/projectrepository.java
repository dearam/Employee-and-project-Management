package com.project.one.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.project.one.dto.chartdata;
import com.project.one.entities.project;

public interface projectrepository extends CrudRepository<project,Long>{
	
	@Override
	public List<project> findAll();
	
	@Query(nativeQuery=true,value="select stage as label , COUNT(*) as alue "
			+ "FROM PROJECT "
			+ "GROUP BY stage")
	public List<chartdata> projectstatus();

}
