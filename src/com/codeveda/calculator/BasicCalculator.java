package com.codeveda.calculator;

import java.util.Scanner;

public class BasicCalculator 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		BasicCalculator calc=new BasicCalculator();
		System.out.println("Enter the first input ::");
		double num1=sc.nextDouble();
		System.out.println("Enter the operation(+,-,*,/): ");
		char operator=sc.next().charAt(0);
		System.out.println("Enter the second input ::");
		double num2=sc.nextDouble();
		
		
		double result;
		
		switch(operator)
		{
			case '+':
				result=calc.add(num1, num2);
				System.out.println("Result::"+ result);
				break;
				
			case '-':
				result=calc.subtract(num1, num2);
				System.out.println("Result::"+ result);
				break;
				
			case '*':
				result=calc.multiply(num1, num2);
				System.out.println("Result::"+ result);
				break;
				
			case '/':
				result=calc.divide(num1, num2);
				if(!Double.isNaN(result))
				{
					System.out.println("Result::"+result);
				}
				break;
				
			default:
				System.out.println("Invalid operation");
		}
		sc.close();
	}

	public double add(double a,double b)
	{
		return a+b;
	}
	public double subtract(double a,double b)
	{
		return a-b;
	}
	public double multiply(double a,double b)
	{
		return a*b;
	}
	public double divide(double a,double b)
	{
		if(b==0)
		{
			System.out.println("Error:: Divison by zero is not allowed.");
			return Double.NaN;
		}
		return a/b;
	}
	
}
