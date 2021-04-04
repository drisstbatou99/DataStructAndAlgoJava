package com.ds;

class Student {
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


public class OneDArray {

	static void OneDArrayMain() {
		System.out.println("======================OneDArrayMain=========================");
		//normal numbers
		System.out.println("===========normal numbers==============");
		int [] numbers = new int[5];
		for(int i=0;i<5; i++) {
			numbers[i] = i;
		}
		
		for (int i=0; i<5;i++) {
			System.out.println(numbers[i]);
		}
		
		//using a class
		System.out.println("===========using a class==============");
		Student [] students =new Student[4];
		students[0]=new Student("Driss",29);
		students[1]=new Student("Ismail",32);
		students[2]=new Student("Fatima",24);
		students[3]=new Student("Youssef",27);
		
		for (int i=0;i<4; i++) {
			students[i].println();
		}System.out.println("===========");
		//use foreach
		for (Student student: students) {
			student.println();
		}
	}

}
