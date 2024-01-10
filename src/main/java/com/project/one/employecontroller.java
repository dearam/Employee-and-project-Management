package com.project.one.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.one.dao.employerepository;
import com.project.one.entities.employe;

@Controller
@RequestMapping("/employe")
public class employecontroller {
	
	@Autowired
	employerepository emprepo;
	
	@GetMapping
	public String displey(Model model) {
		List<employe> employes=emprepo.findAll();
		model.addAttribute("employeList",employes);
		return "employes/list-employe";
	}
	
	@GetMapping("/new")
	public String first(Model model) {
		employe anemploye=new employe();
		model.addAttribute("employe", anemploye);
		return("employes/new-employe");
	}
	@PostMapping("/save")
	public String createempolyee(Model model,employe employe) {
		emprepo.save(employe);
		return "redirect:/employe/new";
	}

}
