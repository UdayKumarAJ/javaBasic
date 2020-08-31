package com.java.section1;

import java.util.Scanner;

public class Java7_A extends Java_7_P 
{
	public static void main(String[] args) 
	{
		Java_7_P p = new Java_7_P();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the calculation : ");
		System.out.print("1 for Finding the power value");
		System.out.println("2 for Finding the fabonacci series ");
		int a = sc.nextInt();
		switch (a) {
		case 1 : p.Finding_Power();	
		break;
		case 2 : 

		default:
			break;
		}
		p.Finding_Power();
		
	}

	
}
