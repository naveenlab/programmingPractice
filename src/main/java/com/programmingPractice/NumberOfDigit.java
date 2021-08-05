package com.programmingPractice;

public class NumberOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 3849324;
		int count = 0;
		while(num!=0) {
			num = num/10;
			count++;
		}
		
		System.out.println("NumberOfDigit: "+count);

	}

}
