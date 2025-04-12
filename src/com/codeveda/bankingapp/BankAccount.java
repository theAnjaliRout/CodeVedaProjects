package com.codeveda.bankingapp;

public class BankAccount 
{
	private double balance;

	public BankAccount() 
	{
		this.balance = 0.0;
	}
	
	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Amount deposited :₹"+amount);
			
		}
		else
		{
			System.out.println("Invalid deposited amount");
		}
	}
	
	public void witdraw(double amount)
	{
		if(amount<=0)
		{
			System.out.println("Invalid withdrawal amount.");
		}
		else if(amount>balance)
		{
			System.out.println("Insufficient funds");
		}
		else
		{
			balance-=amount;
			System.out.println("Amount Withdraw: ₹"+amount);			
		}
	}	
	
	public void checkBalance()
	{
		System.out.println("Current Balance::"+balance);
	}
}
