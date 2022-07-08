package com.example.demo;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.*;

@Component
//@Scope(value = "prototype")
public class Alien {
	
	int aid;
	String aname;
	String tech;
	@Autowired
	@Qualifier("lap1")
	// by default search for laptop (lower case class)
	Laptop laptop;
	
	Alien(){
		System.out.println("object created");
	}
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public void show() {
		System.out.println("Hello i am alien");
		laptop.compile();
	}

}
