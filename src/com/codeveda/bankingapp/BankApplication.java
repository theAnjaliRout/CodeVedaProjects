package com.codeveda.bankingapp;

import java.util.Scanner;

public class BankApplication 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		BankAccount account=new BankAccount();
		
		while(true)
		{
			System.out.println("\n===== BANK MENU =====");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.println("Choose an Option(1-4) :");
			
			int option=sc.nextInt();
			
			switch(option)
			{
				case 1:
					System.out.println("Enter amount to deposite: ₹");
					double depositeAmount=sc.nextDouble();
					account.deposit(depositeAmount);
					break;
					
				case 2:
					System.out.println("Enter amount to withdraw: ₹");
					double withdrawAmount=sc.nextDouble();
					account.witdraw(withdrawAmount);
					break;
					
				case 3:
					account.checkBalance();
					break;
					
				case 4:
					System.out.println("Thank you for using the banking system");
					sc.close();
					return;
				default:
					System.out.println("Invalid Option..Try Again!!");	
			}
		}
	}
}
