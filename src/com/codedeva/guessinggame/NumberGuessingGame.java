package com.codedeva.guessinggame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		
		int secretNumber=random.nextInt(100)+1;
		int attempts=5;
		boolean hasWon=false;
		
		System.out.println("Welcome to the Number Guessing Game!");
		 System.out.println("I'm thinking of a number between 1 and 100.");
		System.out.println("You have " + attempts + " attempts to guess it.\n");
		
		for(int i=1;i<=attempts;i++)
		{
			System.out.println("Attempts "+ i +" Enter your guess::" );
			
			try
			{
				int guess=Integer.parseInt(sc.nextLine());
				
				if(guess<1||guess>100)
				{
					System.out.println("Please enter a number 1 and 100");
					i--;
					continue;
				}
				if(guess == secretNumber)
				{
					System.out.println("Correct ! you guesse the number.");
					hasWon=true;
					break;
				}
				else if(guess<secretNumber)
				{
					System.out.println("Too low!\n");
				}
				else
				{
					System.out.println("Too high!\n");
				}
			}
			catch (NumberFormatException e) 
			{
				System.out.println("Invalid input ! Please enter a valid number.\n");
				i--;
			}
		}
		
		if(!hasWon)
		{
			System.out.println("Sorry ! You've used all attempts. The number was::"+attempts);
		}
		
		sc.close();
	}

}
