package com.project.one.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.one.dao.employerepository;
import com.project.one.dao.projectrepository;
import com.project.one.dto.chartdata;
import com.project.one.dto.employeepro;
import com.project.one.entities.project;
import com.project.one.stringexample.car;

@Controller

public class homecontroller {
	
	@Autowired 
	car Car;
	
	@Autowired 
	projectrepository prorepo;
	
	@Autowired
	employerepository emrepo;
	
	@GetMapping("/home")
	public String displayhome(Model model) throws JsonProcessingException {
		Map<String,Object> map=new HashMap<>();
		
		List<project> projectempl=prorepo.findAll();
		model.addAttribute("projectempList",projectempl);
		
		List<chartdata> projectdata =prorepo.projectstatus();
		ObjectMapper objectmapper=new ObjectMapper();
		
		String jsonString=objectmapper.writeValueAsString(projectdata);
		model.addAttribute("projectstatus",jsonString);
		
		List<employeepro> employeeproject=emrepo.employeeproject();
		model.addAttribute("employeprojectList",employeeproject);
		return "main/home";
	}

}
