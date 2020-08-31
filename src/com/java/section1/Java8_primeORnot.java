package com.java.section1;

import java.util.Scanner;

public class Java8_primeORnot 
{
	
	public static void main(String[] args) 
	{
		int i, m=0, flag=0;
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.print("input number: ");
		int n = sc.nextInt();
		sc.close();
		m=n/2;
		if (n==0 || n==1) 
		{
			System.out.println(n+" is not prime numebr.");
		}
		else 
		{
			for ( i = 2; i <=m; i++) 
			{
				if (n%i==0)
				{
					System.out.println(n+" is not a prime numebr.");
					flag=1;
					break;
				}
			}
			
			if (flag==0) 
			{
				System.out.println(n+" is a prime numebr.");
				
			}
			
		}
		
	}
	

}
