package edu.kiet.AOPSecB1;

import org.springframework.stereotype.Component;

@Component
public class Transaction {
	public void credit() {
		System.out.println("Credit by OnlineTransaction");
	}
}
