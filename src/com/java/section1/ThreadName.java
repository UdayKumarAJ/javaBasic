package com.java.section1;

public class ThreadName 
{
	public static void main(String[] args) 
	{
		Runnable r1 = () ->
		{
			System.out.println("execution thread 1");
		};
		Runnable r2 = () ->
		{
			System.out.println("execution thread 2");
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		String tname1 = t1.getName();
		String tname2 = t2.getName();
		
		System.out.println(tname1);
		System.out.println(tname2);
		
		t1.setName("one thread");
		t2.setName("two thread");
		
		String setS1 = t1.getName();
		String setS2 = t2.getName();
		
		System.out.println(setS1);
		System.out.println(setS2);
		
		long tlname1 = t1.getId();
		long tlname2 = t2.getId();
		
		System.out.println(tlname1);
		System.out.println(tlname2);
		
		t1.start();
		t2.start();
	}

}
