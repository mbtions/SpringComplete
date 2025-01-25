package edu.kiet.AOPSecB1;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy  // Proxy: java compiler gets permission on behalf of the function
public class AOPMessage {
	
	// advice 1 (after adding point cut)
	// format of Advice is @JoinPoint("Point-cut")
	@After("execution(public void ATMTransaction.credit())")
	public void thankyou() {
		System.out.println("Thank You for using ATM!");
	}
	
	// advice 2
	@Before("execution(public void ATMTransaction.debit())")
	public void welcome() {
		System.out.println("Welcome to ATM!");
	}
}
