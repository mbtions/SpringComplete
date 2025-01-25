package in.mbtions.program3_annotation.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("Meenakshi")
	private String name;
	@Value("102")
	private int rollno;
	@Value("meenakshi@gmail.com")
	private String email;
	@Value("89.56f")
	private float marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}

	public void display() {
		System.out.println("Student object created!\n-------------------------------------");
		System.out.println("Name: "+name+"\nRoll no: "+rollno+"\nMarks: "+marks+"\nEmail: "+email);
	}
}
