package com.ds;

class hashTableArray<T>{
	Entry [] arrayHash;
	int size;
	
	public hashTableArray(int size) {
		this.size= size;
		arrayHash= new Entry[size];
		
		for(int i=0;i<size;i++) {
			arrayHash[i]= new Entry();
		}
	}
	
	int getHash(int key) {
		return key%size;
	}
	public void put(int key, Object value) {
		int hashIndex= getHash(key);
		Entry arrayValue= arrayHash[hashIndex];
		Entry newItem= new Entry(key, value);
		newItem.next = arrayValue;
		arrayValue.next= newItem;
	}
	public T get(int key) {
		T value= null;
		int hashIndex= getHash(key);
		Entry arrayValue= arrayHash[hashIndex];
		while(arrayValue != null) {
			if(arrayValue.getKey() == key) {
				value = (T) arrayValue.getValue();
				break;
			}
			arrayValue =arrayValue.next;
		}
		
		return value;
	}
}
class Entry<T>{
	int key;
	Object value;
	Entry next;
	public Entry(int key, Object value) {
		this.key= key;
		this.value=value;
		next= null;
	}
	public Entry() {
		next= null;
	}
	public int getKey() {
		return key;
	}
	public Object getValue() {
		return value;
	}
	
}
public class HashTableTester {
	
	public static void HashTableTesterMain() {
		System.out.println("======================HashTableTesterMain=========================");
		hashTableArray<String> hm = new hashTableArray<String>(10);
		hm.put(11,"Driss");
		hm.put(12,"Kamal");
		hm.put(13,"Hassan");
		System.out.println(hm.get(13));
		
	}
}
