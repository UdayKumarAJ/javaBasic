package com.pag.lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
	public static void main(String[] args) {
		new Thread(() -> {
			String s = "one";
			String s1 = "two";
			System.out.println(s);
			System.out.println(s1);
		}).start();
	
		Person p1 = new Person("uday",25);
		Person p2 = new Person("maga",30);
		Person p3 = new Person("pretham",25);
		Person p4 = new Person("king",30);
		
	List<Person> persons = new ArrayList<>();
	persons.add(p1);
	persons.add(p2);
	persons.add(p3);
	persons.add(p4);
	
	
	}
}


class Person {
	private String name;
	private int age;

	
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}

}
