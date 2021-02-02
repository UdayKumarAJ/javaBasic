package com.java.section1;

public class ThreadSync 
{
	static String s1 = new String("hi");
	public static void main(String[] args) 
	{
		
		System.out.println("program starts...");
		
		Runnable r1 = ()->
		{
			System.out.println("thread t1 waiting to be lock s1...");
			synchronized (s1) 
			{
				System.out.println("t1 locked s1");
				s1 = s1+" java";
				System.out.println("s1 is :"+s1);
			}
			System.out.println("t1 released lock on s1");
		};
		
		Runnable r2 = ()->
		{
			System.out.println("thread t2 waitin to lock s1");
			synchronized (s1) 
			{
				System.out.println("t2 locked s1");
				s1 = s1+" sql";
				System.out.println("s1 = "+s1);
			}
			System.out.println("t1 released lock on s1");
		};
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
		
	}

}
