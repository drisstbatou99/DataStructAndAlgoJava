package com.ds;

public class Student {
	String name;
	int age;
	public Student (String name,int age) {
		this.name= name;
		this.age=age;
	}
	public void println() {
		System.out.println(name+" "+ Integer.toString(age));
	}
}
