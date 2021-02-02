package com.java.section1;

import java.util.Scanner;

public class BloodGroupType 
{
	
	private String bloodType;
	private String rhFactor;
	
	public BloodGroupType() 
	{
		bloodType = "";
		rhFactor = "";
	}

	public BloodGroupType(String bloodType, String rhFactor) 
	{

		this.bloodType = bloodType;
		this.rhFactor = rhFactor;
	}

	
	public void display()
	{
		System.out.println(bloodType+rhFactor+" is added to the blood bank");
	}
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Blood Type(O, A, B, AB)");
	    System.out.println("Enter rhFactor('+' or '-')");
		String bt = in.nextLine();
		String rh = in.nextLine();
		 	if (in.nextLine().equals("")) 
		 	{
		 		System.out.println("please enter valid value");
			}
		 	else
		 	{
		 		BloodGroupType bgt = new BloodGroupType(bt,rh);
				bgt.display();
				
		 	}
		 	in.close();
		
		
	     
	     
	     
	     
	}

}
