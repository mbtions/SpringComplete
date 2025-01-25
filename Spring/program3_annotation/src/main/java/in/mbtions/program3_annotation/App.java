package in.mbtions.program3_annotation;

import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.mbtions.program3_annotation.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
    	/* Using Annotations with XML-based configuration */
    	ApplicationContext context1 = new ClassPathXmlApplicationContext("/in/mbtions/program3_annotation/config.xml");
    	
    	Student std1 = (Student) context1.getBean("student");
    	std1.display();
    	
    	/* Using Annotations with Java-based configuration */
    	ApplicationContext context2 = new AnnotationConfigApplicationContext(Config.class);
    	
    	Student std2 = (Student) context2.getBean("student");
    	std2.display();
    }
}
