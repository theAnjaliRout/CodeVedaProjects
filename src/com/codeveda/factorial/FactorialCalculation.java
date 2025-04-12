package com.codeveda.factorial;

import java.util.Scanner;

public class FactorialCalculation 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ::");
		int num=sc.nextInt();
		
		try
		{
			long result=factorial(num);
			System.out.println("Factorial of "+ num +" is:"+result);
		}
		catch (IllegalArgumentException e) 
		{
			e.printStackTrace();
		}
		sc.close();
	}
	
	public static long factorial(int n)
	{
		if(n<0)
		{
			throw new IllegalArgumentException("Factorial is not defined for negative numbers");
		}
		else if(n==0 || n==1)  //only one condition need to be true
		{
			return 1;
		}
		else
		{
			return n*factorial(n-1);
		}
	}

}
