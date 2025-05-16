/* Assignment 5: Static vs Instance Methods
Create a class Calculator with:

A static method add(int a, int b).

A non-static method multiply(int a, int b).

From main(), show that:

Calculator.add(2,3) works without an object.

You need new Calculator().multiply(2,3) to call multiply. */

import java.util.*;

class Calculator
{
	// Static method: can be called without creating an object
	public static int add(int a, int b)
	{
		return a + b;
	}
	
	// Instance method: requires an object to be called
	public int multiply(int a, int b)
	{
		return a * b;
	}
}

public class Static5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 2 integers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		// Static method call - no object needed
		System.out.println("Addition: " + Calculator.add(num1, num2));
		
		// Creating an object to call non-static (instance) method
		Calculator obj = new Calculator();
		
		// Instance method call - using object
		System.out.println("Multiplication: " + obj.multiply(num1, num2));
	}
}
