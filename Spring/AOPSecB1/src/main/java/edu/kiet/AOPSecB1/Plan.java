package edu.kiet.AOPSecB1;
import java.io.*;

public abstract class Plan {
	protected double rate;
	abstract void getRate();

	public void calculateBill(int units){
		System.out.println(units*rate);
	}
}