package com.java.section1;

import java.util.Scanner;

public class Java_1 
{

	
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("give input A or B");
			String c = sc.nextLine();
			
			
			switch (c) {
			case "A": System.out.println("main select A");
				
				break;
			case "B" : System.out.println("select B"); 

			default:
				break;
			}
			
			sc.close();
			
		}
	
	
}
