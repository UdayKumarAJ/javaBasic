package com.company.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exp1 
{
	public static void main(String[] args) 
	{
		List<Integer> values = new ArrayList<>(); // duplicate values are present in list collection ,, list is mutable
		values.add(215);
		values.add(451);
		values.add(149);
		values.add(963);
		
		Comparator<Integer> c = (i ,j) -> i%10>j%10?1:-1;
		
		Collections.sort(values, c);
		
		
		for(Integer o : values)
		{
			System.out.println(o);
		}
		
		
		
	}

}
