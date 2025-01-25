package in.mbtions.program1_xml.beans;

public class Student {
	private String name;
	private int rollno;
	private String email;
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
		System.out.println("Name: "+name+"\nEmail: "+email+"\nRoll No: "+rollno+"\nMarks: "+marks);
	}
	
}
