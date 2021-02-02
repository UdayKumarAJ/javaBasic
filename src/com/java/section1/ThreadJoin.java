package com.java.section1;

public class ThreadJoin 
{
	public static void main(String[] args) 
	
	{
		System.out.println("Program Starts...");
		Runnable r1 = () ->
		{
			for (int i = 0; i < 3; i++) 
			{
				System.out.println("thread one..");
			}
		};
		
		Runnable r2 = ()->
		{
			for (int i = 0; i < 3; i++) 
			{
			System.out.println("THREAD TWO");	
			}
		};
		
		Thread t2 = new Thread(r2);
		Thread t1 = new Thread(r1);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Program ends...");
		
	}

}
