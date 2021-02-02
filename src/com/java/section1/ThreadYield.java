package com.java.section1;

public class ThreadYield 
{
	public static void main(String[] args) 
	{
		
		Runnable r1 =()->
		{
			Thread.yield();
			
			for (int i = 0; i < 5; i++) 
			{
				System.out.println("Thread one");
			}
		};
		Runnable r2 =()->
		{
			
			
			for (int i = 0; i < 3; i++) 
			{
				System.out.println("Thread two");
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		
	}

}
