package com.java.section1;

import java.util.Scanner;

public class Java_5_DoWhileLoop 
{
	public static void main(String[] args) 
	{
		Double number , sum = 0.0;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Enter the number :");
			number = input.nextDouble();
			sum += number;
		} while (number != 0.0);
		
		System.out.println("Sum :"+sum);
		input.close();
	}
	

}
