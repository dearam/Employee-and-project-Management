package com.project.one.stringexample;

public class car {
	engine e;
	door d;
	tires t;
	public car(engine e, door d, tires t) {
		this.e = e;
		this.d = d;
		this.t = t;
	}
	
	public void printcardata() {
		System.out.println(this.e+" "+this.d);
	}
	
	

}
