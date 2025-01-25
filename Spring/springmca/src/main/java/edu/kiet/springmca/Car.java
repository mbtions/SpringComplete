package edu.kiet.springmca;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // it is a bean
public class Car implements Vehicle {
	// setter injection
	@Value("Honda City") // annotation default value
	String name;
	@Value("2024") // annotation default value
	String model;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void info() {	
		System.out.println("Car\nName="+name+",\tModel="+model);	
	}
}
