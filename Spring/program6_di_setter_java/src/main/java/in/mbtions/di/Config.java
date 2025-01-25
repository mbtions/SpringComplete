package in.mbtions.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.mbtions.di.beans.Address;
import in.mbtions.di.beans.Student;

@Configuration
public class Config {
	
	@Bean
	public Address createAddressObject() {
		Address addr = new Address();
		
		addr.setHno(265);
		addr.setCity("Meerut");
		addr.setPincode(201208);
		
		return addr;
	}
	
	@Bean
	public Student createStudentObject() {
		Student std = new Student();
		
		std.setName("Jigyasa");
		std.setRollno(203);
		std.setAddress(createAddressObject());
		
		return std;
	}
 }
