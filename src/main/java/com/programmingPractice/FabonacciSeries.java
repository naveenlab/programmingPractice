package com.programmingPractice;

public class FabonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0, 1, 1, 2, 3, 5, 8, 13, 21.
		int f1 = 0; 
		int f2 = 1; 
		int f3;
		int count =  10;
		
		System.out.print(f1+" "+f2);
		for(int i =2; i< count; i++) {
			f3 = f1+f2;
			System.out.print(" "+f3);
			f1 = f2;
			f2 = f3;
		}
		
	}

}
