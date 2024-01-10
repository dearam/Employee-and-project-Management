package com.project.one.dao;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.project.one.dto.employeepro;
import com.project.one.entities.employe;

public interface employerepository extends CrudRepository<employe,Long>{
	@Override
	public List<employe> findAll();
	
	@Query(nativeQuery=true,value="SELECT EMPLOYE.FIRSTNAME,  EMPLOYE.LASTNAME, COUNT(JOINPE .EMPLOYEID) as  PROJECTCOUNT "
			+ "FROM EMPLOYE "
			+ "INNER JOIN  JOINPE ON EMPLOYE.EMLOYEID=JOINPE .EMPLOYEID "
			+ "GROUP BY EMPLOYE.FIRSTNAME,EMPLOYE.LASTNAME")
	public List<employeepro> employeeproject();
}
