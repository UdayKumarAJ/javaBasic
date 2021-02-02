package com.java.section1;

public class ThreadDeadLock 
{
	static String s1 = new String("hi");
	static String s2 = new String("hello");
	
	public static void main(String[] args) 
	{
		System.out.println("program starts...");
		
		Runnable r1 = () ->
		{
		System.out.println("t1 locked to s1");
		synchronized(s1) 
			{
				System.out.println("t1 locked s1");
				System.out.println("t1 waiting to lock s2");
				synchronized (s2) 
				{
					System.out.println("t1 locked s2");
					System.out.println("t1 released lock on s2");
				}
			}
			System.out.println("t1 release lock on s1");
		};
		
		Runnable r2 = ()->
		{
			System.out.println("t2 waiting to lock s2");
			synchronized (s2) 
			{
				System.out.println("t2 locked to s2");
				synchronized (s1) 
				{
					System.out.println("t2 locked s2");
					System.out.println("t2 release lock on s2");
				}
			}
			System.out.println("t2 release lock on s2");
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
}
