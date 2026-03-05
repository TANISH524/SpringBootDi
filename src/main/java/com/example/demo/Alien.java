package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	
	private Laptop laptop;
	
	@Autowired
	public Alien(Laptop laptop) {
		this.laptop =laptop;
		System.out.println("Alien constructor called");
		
	}
private String ide;
private String age;
private String name;
public String getIde() {
	return ide;
}
public void setIde(String ide) {
	this.ide = ide;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void Show() {
	laptop.Shows();
	System.out.println("tanish jaswal object created");
}

}
