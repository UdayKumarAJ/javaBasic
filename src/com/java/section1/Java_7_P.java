package com.java.section1;

import java.util.Scanner;

public class Java_7_P 

{
	Scanner sc = new Scanner(System.in);
	 public int  Finding_Power()
	{
		
		System.out.println("Finding Power values :- ");
		System.out.print("Enter the Index number = ");
		int a = sc.nextInt();
		int c = a;
		System.out.println("Enter the Power value = ");
		int b = sc.nextInt();
		for (int i = 0; i < b; i++) 
		{
			System.out.println(a);
			a = c*a;
		}
		return a;
	}
	 
	private void Fibonacci() 
	{
		
		int a = sc.nextInt();

	}
	

}
