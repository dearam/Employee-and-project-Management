package com.project.one.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.one.dao.employerepository;
import com.project.one.dao.projectrepository;
import com.project.one.entities.employe;
import com.project.one.entities.project;

@Controller
@RequestMapping("/project") 
public class projectcontroller {
	
	@Autowired
	projectrepository prorep; 
	
	@Autowired
	employerepository emrepo;
	
	@GetMapping("")
	public String displey(Model model) {
		List<project> projects=prorep.findAll();
		model.addAttribute("projectList",projects);
		return "projects/list-project"; 
	}
	@GetMapping("/new")
	public String frant(Model model) {
		project project1=new project();
		List<employe> employe1=emrepo.findAll();		
		model.addAttribute("project", project1);
		model.addAttribute("employeesproject", employe1); 
		
		return "projects/new-pro";
	}
	
	@PostMapping("/save")
	public String createprojectmodel(project project,Model model) {
		prorep.save(project);
		
		
		return "redirect:/project/new";
	}

}
