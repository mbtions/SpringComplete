package in.mbtions.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

import in.mbtions.di.beans.Student;

/*
 * App using Dependency Injection with Setter Methods
 * 
 * */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("/in/mbtions/di/config.xml");
        
        Student std = (Student) context.getBean(Student.class);
        std.display();
    }
}
 