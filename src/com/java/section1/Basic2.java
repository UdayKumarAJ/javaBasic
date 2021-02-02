package com.java.section1;

public class Basic2 
{
	public static void main(String[] args) 
	{
		String[] oneSentence = {"fashion", "trend","style","design","new" };
		String[] twoSentence = {"cloths","furniture","tables","house","interior"};
		String[] threeSentence = {"remodel","purchase","upgrade","rebuild"};
		
		int oneSen = oneSentence.length;
		int twoSen = twoSentence.length;
		int threeSen = threeSentence.length;
		
		int ran1 = (int) (Math.random()*oneSen);
		int ran2 = (int) (Math.random()*twoSen);
		int ran3 = (int) (Math.random()*threeSen);
		
		String phrase = oneSentence[ran1]+" "+twoSentence[ran2]+" "+threeSentence[ran3];
		
		System.out.println("what we need is a "+phrase);
	}

}
