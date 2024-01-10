package com.project.one;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.project.one.dao.employerepository;
import com.project.one.dao.projectrepository;
import com.project.one.stringexample.car;
import com.project.one.stringexample.door;
import com.project.one.stringexample.engine;
import com.project.one.stringexample.tires;

@SpringBootApplication
public class ProjectApplication {
	
	@Autowired
	public employerepository emrepo;
	
	@Autowired
	public projectrepository prorepo;

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}
	
	
//	@Bean
//	CommandLineRunner runner(){
//		return args ->{
//			employe emp1=new employe("King","kowsik","kowsik@gmail.com");
//			employe emp2=new employe("kowsigan","MV","kowsiganmv@gmail.com");
//			employe emp3=new employe("Ram","prasath","Ram@gmail.com");
//			employe emp4=new employe("Vicky","G","Vicky@gmail.com");
//			employe emp5=new employe("Suriya","prakash","surya@gmail.com");
//			employe emp6=new employe("jhon","paul","jhon@gmail.com");
//			employe emp7=new employe("deapak","jeron","jeron@gmail.com");
//			employe emp8=new employe("manoj","kumar","manoj@gmail.com");
//			employe emp9=new employe("mahesh","bro","mahesh@gmail.com");
//			
//			project pro1=new project("Starter Project","NOTSTARTED","This project by ainstain");
//			project pro2=new project("Project 24","COMPLETED","This project by Surya");
//			project pro3=new project("Poniyin selvan","INPROGRESS","This project by Manirathnam");
//			project pro4=new project("NAANE VARUVEAN","NOTSTARTED","This project by SELVARAGAVAN");
//			project pro5=new project("AYRATHIL ORUVAN","NOTSTARTED","This project by Danush");
//			
//			pro1.addemploye(emp1);
//			pro1.addemploye(emp2);
//			pro2.addemploye(emp2);
//			pro2.addemploye(emp3);
//			pro3.addemploye(emp3);
//			pro3.addemploye(emp4);
//			pro4.addemploye(emp4);
//			pro4.addemploye(emp5);
//			pro5.addemploye(emp5);
//			pro5.addemploye(emp6);
//			
//
//			emp1.setProjects(Arrays.asList(pro1));
//			emp2.setProjects(Arrays.asList(pro1,pro2));
//			emp3.setProjects(Arrays.asList(pro2,pro3));
//			emp4.setProjects(Arrays.asList(pro3,pro4));
//			emp5.setProjects(Arrays.asList(pro4,pro5));
//			emp6.setProjects(Arrays.asList(pro5));
//			
//			emrepo.save(emp1);	
//			emrepo.save(emp2);	
//			emrepo.save(emp3);	
//			emrepo.save(emp4);	
//			emrepo.save(emp5);	
//			emrepo.save(emp6);	
//			emrepo.save(emp7);	
//			emrepo.save(emp8);	
//			emrepo.save(emp9);
//			
//			prorepo.save(pro1);
//			prorepo.save(pro2);
//			prorepo.save(pro3);
//			prorepo.save(pro4);
//			prorepo.save(pro5);
//		};
//	}

}
