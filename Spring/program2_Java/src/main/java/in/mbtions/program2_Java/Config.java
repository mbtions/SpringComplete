package in.mbtions.program2_Java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.mbtions.program2_Java.beans.Student;

@Configuration
public class Config {
	
	@Bean("stdId1")
	public Student getStudent1() {
		Student std = new Student();
		std.setName("Jagriti");
		std.setRollno(103);
		std.setEmail("jagriti.pathak@gmail.com");
		std.setMarks(87);
		return std;
	}
	
	@Bean("stdId2")
	public Student getStudent2() {
		Student std = new Student();
		std.setName("Meenakshi");
		std.setRollno(102);
		std.setEmail("meenakshi@gmail.com");
		std.setMarks(78);
		return std;
	}
}
