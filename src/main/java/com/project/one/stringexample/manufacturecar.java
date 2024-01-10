package com.project.one.stringexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class manufacturecar {
	@Bean
	public car newcar() {
		engine e=new engine();
		door d=new door();
		tires t=new tires();
		
		return new car(e,d,t);
	}

}
