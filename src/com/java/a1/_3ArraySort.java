package com.java.a1;

import java.util.Arrays;

public class _3ArraySort 
{
	public static void main(String[] args) 
	{
		int[] array = new int[] {101,205,12,35,159};
		
		System.out.println("Array before sort.");
		for(int elem : array)
		{
			System.out.println(elem);
		}
		// Call Array.sort on the int array
		Arrays.sort(array);
		System.out.println("Array element after sorting.");
		for(int elem : array)
		{
			System.out.println(elem);
		}
		
		
		
	}

}
