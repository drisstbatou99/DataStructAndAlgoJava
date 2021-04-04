package com.ds;
public class Main {
	static final boolean OneDArrayMain_EN= false;
	static final boolean TwoDArrayMain_EN= false;
	static final boolean DynamicArrayMain_EN = false;
	static final boolean LinkedListTesterMain_EN = false;
	static final boolean HashTableTesterMain_EN = true;
	
	public static void main(String[] args) {

		if (OneDArrayMain_EN ) OneDArrayTester.OneDArrayMain();
		if (TwoDArrayMain_EN) TwoDArrayTester.TwoDArrayMain();
		if(DynamicArrayMain_EN) DynamicArrayTester.DynamicArrayMain();
		if(LinkedListTesterMain_EN) LinkedListTester.LinkedListTesterMain();
		if(HashTableTesterMain_EN) HashTableTester.HashTableTesterMain();
	}

}
