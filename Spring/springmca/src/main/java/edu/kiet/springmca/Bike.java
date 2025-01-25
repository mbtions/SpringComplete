package edu.kiet.springmca;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	String name;
	String model;
	
	// constructor injection for annotation
	Bike(@Value("Honda Shine") String name, @Value("2023")String model) {
		this.name = name;
		this.model = model;
	}
	public void info() {
		System.out.println("Bike\nName="+name+",\tModel="+model);
	}
}