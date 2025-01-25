package in.mbtions.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.mbtions.di.beans.Address;
import in.mbtions.di.beans.Student;

@Configuration
public class Config {
	
	@Bean
	public Address createAddressObject() {
		Address addr = new Address(200, "Chandigarh", 123211);
		
		return addr;
	}
	
	@Bean
	public Student createStudentObject() {
		Student std = new Student(104, "Maanvi", createAddressObject());
		
		return std;
	}
}
