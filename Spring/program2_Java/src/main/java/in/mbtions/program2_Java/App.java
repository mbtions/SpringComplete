package in.mbtions.program2_Java;

import org.springframework.context.*;
import org.springframework.context.annotation.*;

import in.mbtions.program2_Java.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        
        Student std1 = (Student) context.getBean("stdId1");
        std1.display();
        
        System.out.println("-------------------------------------------------");
        
        Student std2 = (Student) context.getBean("stdId2");
        std2.display();
        
    }
}
