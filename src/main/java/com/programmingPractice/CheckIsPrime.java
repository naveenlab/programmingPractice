package com.programmingPractice;

public class CheckIsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 8;
		boolean flag  = false;
		
		if(num == 1 || num == 0 ) {
			System.out.println("Not Prime Number");
		}else{
			for (int i = 2; i < num/2; i++ ) {
				if(num%2==0) {
					flag = true;
					break;
					
				}
			}
		}
		
		if(!flag) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not Prime Number");
		}
	}
		

}
