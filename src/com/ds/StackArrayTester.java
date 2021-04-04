package com.ds;

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
public class StackArrayTester {
	
	public static void StackArrayTesterMain() {
		System.out.println("======================StackArrayTesterMain=========================");
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
}
