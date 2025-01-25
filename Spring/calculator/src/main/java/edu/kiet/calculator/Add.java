package edu.kiet.calculator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class Add implements CalculatorObj{
	@Value("#{new Integer(1)}")
	int num1;
	@Value("#{new Integer(2)}")
	int num2;
	

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public void result() {
		System.out.print("Addition: \na="+num1+"\nb="+num2+"\na+b="+(num1+num2));
	}
}
