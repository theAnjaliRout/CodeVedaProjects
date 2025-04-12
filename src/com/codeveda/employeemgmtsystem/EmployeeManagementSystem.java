package com.codeveda.employeemgmtsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem 
{
	public static ArrayList<Employee>emp=new ArrayList<>();
	private static Scanner sc=new Scanner(System.in);
	
	//methods for crud operation
	
	
	//create
	public static void addEmployee()
	{
		System.out.println("Enter Employee Id::");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name::");
		String name=sc.nextLine();
		System.out.println("Enter Employee Salary::");
		double salary=sc.nextDouble();
		
		
		emp.add(new Employee(name, id, salary));
		System.out.println("Employee added succesfully.\n");
	}
	
	
	//read
	public static void viewEmployee()
	{
		if(emp.isEmpty())
		{
			System.out.println("No Employee Records Found");
		}
		else
		{
			System.out.println("Employee List");
			for(Employee employee:emp)
			{
				System.out.println(employee);
			}
		}
	}
	
	
	//update
	public static void updateEmployee()
	{
		System.out.println("Enter Employee Id to Update ::");
		int id=sc.nextInt();
		
		for(Employee employee:emp)
		{
			if(employee.getId()==id)
			{
				sc.nextLine();
				System.out.println("Enter Employee Name ::");
				String name=sc.nextLine();
				System.out.println("Enter Employee Salary ::");
				double sal=sc.nextDouble();
				
				employee.setName(name);
				employee.setSalary(sal);
				
				System.out.println("Employee Updated Successfully.");
				return;
			}
		}
		System.out.println("Emmployee Not Found");
	}
	
	//delete
	public static void deleteEmployee()
	{
		System.out.println("Enter the Id to Delete ::");
		int id=sc.nextInt();
		
		for(Employee employee:emp)
		{
			if(employee.getId()==id)
			{
				emp.remove(employee);
				System.out.println("Employee Deleted Succesfully.\n");
				return;
			}
		}
		System.out.println("Employee Not Found");
	}
	
	public static void main(String[] args)
	{
		while(true)
		{
			System.out.println("===Employee Management System=======");
			System.out.println("1. Add Employee");
			System.out.println("2.View Employee");
			System.out.println("3.Update Employee");
			System.out.println("4.Delete Employee");
			System.out.println("5.Exit");
			
			
			System.out.println("Choose an Option:");
			int choice =sc.nextInt();
			
			switch(choice)
			{
				case 1:addEmployee();
				break;
				case 2:viewEmployee();
				break;
				case 3:updateEmployee();
				break;
				case 4:deleteEmployee();
				break;
				
				default: 
					System.out.println("Invalid Choice .Try Again.\n");
			}
		}
	}
}
