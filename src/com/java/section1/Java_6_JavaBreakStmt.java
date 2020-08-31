package com.java.section1;

import java.util.Scanner;

public class Java_6_JavaBreakStmt 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i < 50; i++) 
		{
			if (i==5) 
			{
			break;	
			}
		
			System.out.println( i);	
		}
		
		//UserInput
		
		Double number,sum = 0.0;
		Scanner input  = new Scanner(System.in);
		while (true) 
		{
			System.out.println("Enter a Number :");
			
			number = input.nextDouble();
			if (number<0) 
			{
			break;	
			}
			sum+=number;
		}
		System.out.println("Sum :"+sum);
	input.close();	
	}

	
}
