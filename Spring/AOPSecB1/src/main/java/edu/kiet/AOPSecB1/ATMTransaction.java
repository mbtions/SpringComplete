package edu.kiet.AOPSecB1;

import org.springframework.stereotype.Component;

@Component
public class ATMTransaction {
	
	public void credit() {
		System.out.println("Credit by ATMTransaction!");
	}
	
	public void debit() {
		System.out.println("Debit by ATMTransaction!");
	}
	// above functions should be interface functions
}
