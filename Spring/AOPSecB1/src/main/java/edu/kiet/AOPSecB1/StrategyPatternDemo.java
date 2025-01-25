package edu.kiet.AOPSecB1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrategyPatternDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter first value");
		float value1 = Float.parseFloat(br.readLine());
		
		System.out.println("Enter second value");
		float value2 = Float.parseFloat(br.readLine());
		
		Context context = new Context(new Addition());
		System.out.println("Addition = "+context.executeStrategy(value1, value2));
		
		Context context2 = new Context(new Multiplication());
		System.out.println("Multiplication = "+context2.executeStrategy(value1, value2));
		
		Context context3 = new Context(new Subtraction());
		System.out.println("Subtraction = "+context3.executeStrategy(value1, value2));
	}

}
