package edu.kiet.calculator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        CalculatorObj add = context.getBean(Add.class);
        add.result();
        CalculatorObj sub = context.getBean(Sub.class);
        sub.result();
        CalculatorObj mult = context.getBean(Mult.class);
        mult.result();
    }
}
