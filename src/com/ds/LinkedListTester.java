package com.ds;

//Normal LinkedList
class Node{
	Object value;
	Node next;
	public Node(Object value,Node next) {
		this.value = value;
		this.next = next;
	}
}

class LinkedList<T>{
	Node head;
	public LinkedList(){
		head  = null;
	}
	public void add(Object value) {
		Node newNode = new Node(value, null);
		if(head==null) head= newNode;
		else {
			newNode.next=head;
			head= newNode;
		}
	}
	public void delete() {
		head = head.next;
	}
	public void display() {
		Node n= head;
		while(n!=null) {
			System.out.println((T)n.value);
			n=n.next;
		}
	}
}


//DoubleLinkedList
class NodeD{
	Object value;
	NodeD next;
	NodeD previous;
	public NodeD(Object value,NodeD next,NodeD previous) {
		this.value= value;
		this.next= next;
		this.previous= previous;
	}
}


class LinkedListD<T>{
	NodeD head;
	public LinkedListD(){
		head  = null;
	}
	public void add(Object value) {
		NodeD newNode = new NodeD(value, null,null);
		if(head==null) head= newNode;
		else {
			newNode.next=head;
			head.previous= newNode;
			head= newNode;
		}
	}
	public void delete() {
		head = head.next;
		head.previous= null;
	}
	public void display() {
		NodeD n= head;
		while(n!=null) {
			System.out.println((T)n.value);
			n=n.next;
		}
	}
}


class DoubleLinkedList<T>{
	Node head;
	public DoubleLinkedList(){
		head  = null;
	}
	public void add(Object value) {
		Node newNode = new Node(value, null);
		if(head==null) head= newNode;
		else {
			newNode.next=head;
			head= newNode;
		}
	}
	public void delete() {
		head = head.next;
	}
	public void display() {
		Node n= head;
		while(n!=null) {
			System.out.println((T)n.value);
			n=n.next;
		}
	}
}

public class LinkedListTester {
	static final boolean LinkedListNormal_EN=false;
	static final boolean LinkedListD_EN=true;
	public static void LinkedListTesterMain() {
		System.out.println("======================LinkedListTesterMain=========================");
		if(LinkedListNormal_EN) LinkedListNormal();
		if(LinkedListD_EN) LinkedListD();
	}
	
	static void LinkedListNormal() {
		System.out.println("=========LinkedList==========");
		LinkedList<String> ls= new LinkedList<String>();
		ls.add("Driss");
		ls.add("Karim");
		ls.add("Brahim");
		ls.add("Eva");
		System.out.println("==== display list ====");
		ls.display();
		ls.delete();
		System.out.println("==== display list ====");
		ls.display();
	}
	static void LinkedListD() {
		System.out.println("=========LinkedListD==========");
		LinkedList<Integer> ls= new LinkedList<Integer>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		System.out.println("==== display list ====");
		ls.display();
		ls.delete();
		System.out.println("==== display list ====");
		ls.display();
	}

}
