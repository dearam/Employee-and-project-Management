package com.project.one.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class project {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long projectid;
	
	public project() {
		
	}
	
	public project(String name, String stage, String description) {
		super();
		this.name = name;
		this.stage = stage;
		this.description = description;
	}
	
	private String name;
	private String stage;
	private String description;
	
	@ManyToMany(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},
			fetch =FetchType.LAZY)
	@JoinTable(name ="joinPE",
				joinColumns=@JoinColumn(name="projectid"),
				inverseJoinColumns=@JoinColumn(name="employeid"))
	private List<employe> employees;
	
	public List<employe> getEmployees() {
		return employees;
	}

	public void setEmployees(List<employe> employees) {
		this.employees = employees;
	}

	public long getProjectid() {
		return projectid;
	}
	public void setProjectid(long projectid) {
		this.projectid = projectid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void addemploye(employe emp) {
		if(employees==null) {
			employees=new ArrayList<>();
		}
		employees.add(emp);
	}
	
	
	
}
