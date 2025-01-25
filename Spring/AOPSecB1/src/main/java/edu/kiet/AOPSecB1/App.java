package edu.kiet.AOPSecB1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    	ATMTransaction atm = context.getBean(ATMTransaction.class);
    	
//    	AOPMessage msg = context.getBean(AOPMessage.class);    OOPs
    	Transaction t = context.getBean(Transaction.class);
    	t.credit();
    	
    	atm.credit();
//    	msg.thankyou();
    	
//    	msg.welcome();
    	atm.debit();
    }
}
