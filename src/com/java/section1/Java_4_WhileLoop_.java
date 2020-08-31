package com.java.section1;

public class Java_4_WhileLoop_
{
	public static void main(String[] args) 
	{
		int i = 0;
		
		//loop
		while (i<=10) 
		{
			System.out.println("Line :"+i);
			++i;
		}
		
		System.out.println();
		//Assignment operator
		int sum = 0 , n=100;
		while (n!=0) 
		{
			sum += n;
			--n;
		}
		System.out.println("sum :"+sum);
		
	}

}
