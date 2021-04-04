package com.ds;

public class TwoDArray {
	
	static void TwoDArrayMain() {
		
		System.out.println("======================TwoDArrayMain=========================");
		//normal numbers
		System.out.println("===========normal numbers==============");
		int [] [] data = new int [3][3];
		for(int i=0; i<3;i++)
			for(int j=0;j<3;j++) 
				data[i][j]=i+j;
		
		for(int i=0; i<3;i++)
			for(int j=0;j<3;j++) 
				System.out.println(data[i][j]);
	}
}
