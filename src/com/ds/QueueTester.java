package com.ds;

import java.util.Arrays;

//QueueArray
class QueueArray<T>{
	Object [] arrayQueue;
	int rear;
	int front;
	int size;
	public QueueArray(int size) {
		this.size= size;
		arrayQueue = new Object[this.size];
		front = -1;
		rear = -1;
	}
	public boolean isFull() {
		return rear==(size-1);
	}
	public boolean isEmpty() {
		return (front == -1 || front>rear);
	}
	public void queue(Object newItem) {
		if(isFull()) {
			System.out.println("queue is Full");
			return;
		}
		rear= rear+1;
		arrayQueue[rear] = newItem;
		if(front==-1) front=0;
	}
	public Object dequeue() {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return null;
		}
		
		T ObjectOut= (T) arrayQueue[front];
		front= front+1;
		return ObjectOut;
	}
}

//QueueDArray
class QueueDArray<T>{
	
	Object [] arrayQueue;
	int rear;
	int front;
	int size;
	public QueueDArray(int size) {
		this.size= size;
		arrayQueue = new Object[this.size];
		front = -1;
		rear = -1;
	}
	public boolean isFull() {
		return rear==(size-1);
	}
	public boolean isEmpty() {
		return (front == -1 || front>rear);
	}
	public void queue(Object newItem) {
		ensureCapacity(rear+2);
		rear= rear+1;
		arrayQueue[rear] = newItem;
		if(front==-1) front=0;
	}
	public Object dequeue() {
		if(isEmpty()) {
			System.out.println("queue is empty");
			return null;
		}
		
		T ObjectOut= (T) arrayQueue[front];
		front= front+1;
		return ObjectOut;
	}
	
	public int getSize() {
		return arrayQueue.length;
	}

	
	public void ensureCapacity(int minCapacity) {
		int oldCapacity = getSize();
		if(minCapacity > oldCapacity) {
			int newCapacity =  oldCapacity *2;
			if(newCapacity<minCapacity)
				newCapacity = minCapacity;
			arrayQueue = Arrays.copyOf(arrayQueue, newCapacity);
		}
	}
	
}


//QueueLinkedList
class QueueLinkedList<T>{
	NodeD rear;
	NodeD front;
	
	public QueueLinkedList(){
		rear  = null;
		front= null;
	}
	public void queue(Object value) {
		NodeD newNode = new NodeD(value, null,null);
		if(rear==null || front == null) {
			rear = newNode;
			front = newNode;
		}
		else {
			newNode.next=null;
			newNode.previous= rear;
			rear.next= newNode;
			rear= newNode;
		}
	}
	public T dequeue() {
		if(rear==null || front == null) {
			System.out.println("queue is empty");
			return null;
		}
		T value= (T)front.value;
		front= front.next;
		if(front != null) front.previous= null;
		return value;
	}
}
public class QueueTester {
	final static boolean QueueArrayTester_EN= false;
	final static boolean QueueDArray_EN= false;
	final static boolean QueueLinkedListTester_EN=true;
	public static void QueueTesterMain() {
		System.out.println("======================StackArrayTesterMain=========================");
		if(QueueArrayTester_EN) QueueArrayTester();
		if(QueueDArray_EN) QueueDArray();
		if(QueueLinkedListTester_EN) QueueLinkedListTester();
	}

	public static void QueueArrayTester() {
		QueueArray<Integer> queueArray = new QueueArray<Integer>(5);
		queueArray.queue(5);
		queueArray.queue(2);
		queueArray.queue(3);
		queueArray.queue(6);
		queueArray.queue(8);
		System.out.println(queueArray.dequeue());
		System.out.println(queueArray.dequeue());

	}

	public static void QueueDArray() {
		
		QueueDArray<Integer> queueDArray = new QueueDArray<Integer>(2);
		queueDArray.queue(5);
		queueDArray.queue(2);
		System.out.println("size "+ queueDArray.getSize());
		queueDArray.queue(3);
		System.out.println("size "+ queueDArray.getSize());
	}

	public static void QueueLinkedListTester() {
		QueueLinkedList<Integer> queueLinkedList = new QueueLinkedList<Integer>();
		queueLinkedList.queue(5);
		queueLinkedList.queue(2);
		queueLinkedList.queue(3);
		queueLinkedList.queue(6);
		queueLinkedList.queue(8);
		System.out.println(queueLinkedList.dequeue());
		System.out.println(queueLinkedList.dequeue());
		System.out.println(queueLinkedList.dequeue());
		System.out.println(queueLinkedList.dequeue());
		System.out.println(queueLinkedList.dequeue());
		System.out.println(queueLinkedList.dequeue());
	}
}
