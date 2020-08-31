package com.java.section1;

public class Java_3 
{
	public static void main(String[] args) 
	{
		
		char [] vowels = {'a','e','i','o','u'};
		
		// for loop
		for (int i = 0; i < vowels.length; ++i) 
		{
		System.out.print(vowels[i]);	
		}
		
		System.out.println();
		//for-each loop
		//assignment operator
		
		for (char c : vowels) 
		{
			System.out.print(c);
		}
		System.out.println();
		
		//enhanced for-each loop
		
		int[] numbers = {3,4,5,-5,0,12};
		int sum=0;
		for (int number : numbers) 
		{
			sum += number ;
		}
		System.out.println(sum);
		
	}

}
