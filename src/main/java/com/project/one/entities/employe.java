package com.project.one.entities;

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
public class employe {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long emloyeid;
	
	public employe() {
		
	}
	
	public employe(String firstname, String lastname, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	private String firstname;
	private String lastname;
	private String email;
	
	
	@ManyToMany(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},
			fetch =FetchType.LAZY)
	@JoinTable(name ="joinPE",
				joinColumns=@JoinColumn(name="employeid"),
				inverseJoinColumns=@JoinColumn(name="projectid"))
	private List<project> projects;
	
	

	public List<project> getProjects() {
		return projects;
	}

	public void setProjects(List<project> projects) {
		this.projects = projects;
	}

	public long getEmloyeid() {
		return emloyeid;
	}
	public void setEmloyeid(long emloyeid) {
		this.emloyeid = emloyeid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
