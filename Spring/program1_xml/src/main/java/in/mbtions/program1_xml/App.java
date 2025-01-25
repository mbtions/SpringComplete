package in.mbtions.program1_xml;

import org.springframework.context.*;
import org.springframework.context.support.*;

import in.mbtions.program1_xml.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("/in/mbtions/program1_xml/config.xml");
        
        Student std = (Student) context.getBean(Student.class);
        std.display();
    }
}
