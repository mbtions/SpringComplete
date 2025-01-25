package in.mbtions.program2_Java.beans;

public class Student {
	private String name;
	private String email;
	private int rollno;
	private float marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public void display() {
		System.out.println("Student Object Created!");
		System.out.println("Name: "+name+"\nEmail: "+email+"\nRoll No: "+rollno+"\nMarks: "+marks);
	}
	
}
