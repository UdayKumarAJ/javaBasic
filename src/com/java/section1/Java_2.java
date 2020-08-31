package com.java.section1;

import java.util.Scanner;

public class Java_2 
{
	public static void main(String[] args) 
	{
		Scanner sc = null;
		sc = new Scanner(System.in);
		/*
		System.out.print("Input :");
		int n =sc.nextInt();
		for (int i = 0; i <= n; i++) 
		{
			System.out.println("Line :" +i);
		}
		*/
		int sum = 0;
		for (int i = 1; i <=1000; ++i) 
		{
			sum +=  i; 
			
		}
		System.out.println("Sum = "+sum);
		sc.close();
	}
	

}
