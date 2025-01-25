package edu.kiet.springmca;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		// System.out.println( "Hello World!" );
		// Car c = new Car();
		// c.info(); // this is called tightly coupled environment
    	
    	// loosely coupled environment
    	// Vehicle c = new Car(); // this new operator is also not used because it creates object at run-time
    	// c.info();
    	
    	// use beans to generate the object just at the same time when the application executes
    	// to remove the new, you would follow IoC application context
    	
    	// Using BeanFactory
    	// Resource resource = new ClassPathResource("edu/kiet/springmca/Config.xml");
    	// BeanFactory context = new XmlBeanFactory(resource);
    	
    	// when user makes a request bean factory creates an object, 
    	// but in application context, just as the application is sent to the memory all the objects are create
    	
    	// Using Application Context (Now executed as IoC)
    	// ApplicationContext context = new ClassPathXmlApplicationContext("edu/kiet/springmca/Config.xml");  // comment to use Annotations
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    	// Vehicle c = context.getBean("car", Car.class); // for XML
    	Vehicle c = context.getBean(Car.class);
    	c.info();
    	// Built IoC
    	
    	// Now for Bike
    	// Vehicle b = context.getBean("bike", Bike.class); // for XML
    	Vehicle b = context.getBean(Bike.class);
    	b.info();
    	
    	// Setter and Getter injections
    }
}
