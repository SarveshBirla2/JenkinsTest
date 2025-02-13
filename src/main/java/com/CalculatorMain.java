package com;
import com.Calculator;
public class CalculatorMain
{
	public static void main(String args[])
	{
		System.out.println("Calculator Operations......");
 
		Calculator c1 = new Calculator();
		System.out.println("Addition : "+c1.add(10, 20));
		System.out.println("Substraction : "+c1.sub(10, 20));
	
	}
}