package edu.kiet.mcasecb;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// this is called dependency that should not be resolved using new operator instead should be resolved using injection
//    	Vehicle c = new Car(); // Upcasting in java (polymorphism)
    	Vehicle c = new Car();
    	c.info();
    	Vehicle b = new Bike();
    	b.info();
    	
//        System.out.println( "Hello World!" );
    }
}
