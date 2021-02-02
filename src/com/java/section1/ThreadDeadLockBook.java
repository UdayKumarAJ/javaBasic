package com.java.section1;

public class ThreadDeadLockBook 
{
	
	
	static String s1= new String("hi");
	static String s2= new String("android");
	public static void main(String[] args) {
	System.out.println("program start");
	Runnable r1 = () ->
	{
	System.out.println("t1 waiting to lock s1");
	synchronized(s1)
	
	{
	System.out.println("t1 locked to s1");
	System.out.println("t1 waiting to lock s2");
	synchronized(s2)
	{
	System.out.println("t1 locked to s2");
	System.out.println("t1 released lock on s2");
	}
	}
	System.out.println("t1 released lock on s1");
	};
	Runnable r2 = () ->
	{
	System.out.println("t2 waiting to lock s2");
	synchronized(s2)
	{
	System.out.println("t2 locked to s2");
	synchronized(s1)
	{
	System.out.println("t2 locked to s1");
	System.out.println("t2 released lock on s1");
	}
	}
	System.out.println("t2 released lock on s2");
	};
	Thread t1 = new Thread(r1);
	Thread t2 = new Thread(r2);
	t1.start();
	t2.start();
	}}