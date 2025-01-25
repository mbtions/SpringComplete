package edu.kiet.AOPSecB1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GenerateBill {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		GetPlanFactory planFactory = new GetPlanFactory();
		
		System.out.println("Enter the name of the Plan foe which the bill will be generated: ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String planName = br.readLine();
		
		System.out.println("Enter the number of units for bill to be calculated : ");

		int units = Integer.parseInt(br.readLine());
		
		Plan p = planFactory.getPlan(planName); // factory design pattern is loosely coupled environment (polymorphism)

		System.out.println("Bill amount for "+ planName + " of "+units+" units is: ");
		
		p.getRate();
		p.calculateBill(units);
	}

}
