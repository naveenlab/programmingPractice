package com.programmingPractice2;

public class FabonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		int f1 = 0; 
		int f2 = 1; 
		int f3; 
		
		System.out.print(f1+" "+f2+" ");
		
		for(int i=2; i <= num; i++) {
			f3 = f1+f2;
			System.out.print(f3+ " ");
			f1 = f2; 
			f2 = f3;
			
			
					
		}
		

	}

}
