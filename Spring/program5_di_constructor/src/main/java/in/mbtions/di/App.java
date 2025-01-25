package in.mbtions.di;

import in.mbtions.di.beans.Student;
import org.springframework.context.*;
import org.springframework.context.support.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("/in/mbtions/di/config.xml");
        
        Student std = (Student) context.getBean(Student.class);
        std.display();
    }
}
