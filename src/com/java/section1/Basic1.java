package com.java.section1;

import java.util.Scanner;

public class Basic1 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the number of bottles in stock = ");
		int n = sc.nextInt();
		sc.close();
		String word = "Bottles";
		
		while (n>0) 
		{
			if (n==1) 
			{
				word = "Bottle";
			}
			
			System.out.println(n+" "+word+" on the wall" );
			//System.out.println(n+" "+ word+" ");
			System.out.println("take one down pass it around");
			n=n-1;
			
			if (n==0) 
			{
				System.out.println("The beer bottles empty...Need Restock");
			}
			
		}
		
	}

}
