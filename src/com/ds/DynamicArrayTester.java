package com.ds;

public class DynamicArrayTester {
	
	static void DynamicArrayMain() {		
		System.out.println("======================DynamicArrayMain=========================");
		System.out.println("==========Check size===========");
		DynamicArray<Integer> da= new DynamicArray<Integer>();
		da.put(11);
		System.out.println("Size:"+da.getSize());
		da.put(12);
		System.out.println("Size:"+da.getSize());
		da.put(13);
		System.out.println("Size:"+da.getSize());
		da.put(14);
		System.out.println("Size:"+da.getSize());
		da.put(15);
		System.out.println("Size:"+da.getSize());
		da.put(16);
		System.out.println("Size:"+da.getSize());
		System.out.println("==========list Array===========");
		for( int i=0;i<da.getSize();i++) {
			System.out.println(da.get(i));
		}
		
	}
}
