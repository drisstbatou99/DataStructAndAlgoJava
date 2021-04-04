package com.ds;

import java.util.Arrays;

class StackArray<T>{
	Object[] arrayStack;
	int size;
	int top;
	public StackArray(int size) {
		this.size= size;
		arrayStack = new Object[size];
		top = -1;		
	}
	public void push(Object newItem) {
		if(isFull()) {
			System.out.println("Stack is full");
			return;
		}else {
			top = top+1;
			arrayStack[top] = newItem;
		}
	}
	public Object pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}else {
			T item= (T) arrayStack[top];
			top = top -1;
			return item;
		}
	}
	public boolean isFull() {
		return (top == size-1);
	}
	public boolean isEmpty() {
		return (top==-1);
	}
}

class StackDArray<T>{
	Object[] arrayStack;
	int size;
	int top;
	public StackDArray(int size) {
		this.size= size;
		arrayStack = new Object[size];
		top = -1;		
	}
	public void push(Object newItem) {
		ensureCapacity(top+2);
		top = top+1;
		arrayStack[top] = newItem;
	}
	public Object pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}else {
			T item= (T) arrayStack[top];
			top = top -1;
			return item;
		}
	}
	public void ensureCapacity(int minCapacity) {
		int oldCapacity = getSize();
		if(minCapacity > oldCapacity) {
			int newCapacity =  oldCapacity *2;
			if(newCapacity<minCapacity)
				newCapacity = minCapacity;
			arrayStack = Arrays.copyOf(arrayStack, newCapacity);
		}
	}
	public boolean isFull() {
		return (top == size-1);
	}
	public boolean isEmpty() {
		return (top==-1);
	}
	public int getSize() {
		return arrayStack.length;
	}
}
public class StackTester {
	final static boolean StackArrayTester_EN= false;
	final static boolean StackDArray_EN= true;
	public static void StackTesterMain() {
		System.out.println("======================StackArrayTesterMain=========================");
		if(StackArrayTester_EN) StackArrayTester();
		if(StackDArray_EN) StackDArray();
		
	}
	public static void StackArrayTester() {
		System.out.println("======================StackArrayTester=========================");
		StackArray<String> stackArray= new StackArray<String>(4);
		stackArray.push("Driss");
		stackArray.push("Kamal");
		stackArray.push("Amine");
		stackArray.push("Zakaria");
		stackArray.push("hassan");
		while(!stackArray.isEmpty())
			System.out.println(stackArray.pop());
		System.out.println(stackArray.pop());
	}
	public static void StackDArray() {
		System.out.println("======================StackDArray=========================");
		StackDArray<String> stackArray= new StackDArray<String>(2);
		stackArray.push("Driss");
		stackArray.push("Kamal");
		stackArray.push("Amine");
		stackArray.push("Zakaria");
		stackArray.push("hassan");
		while(!stackArray.isEmpty())
			System.out.println(stackArray.pop());
		System.out.println(stackArray.pop());
	}
}
