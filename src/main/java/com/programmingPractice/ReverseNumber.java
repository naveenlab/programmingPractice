package com.programmingPractice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number");
		Scanner sc =  new Scanner(System.in);
		int original_Num = sc.nextInt();
	    int reverse = 0;
		while(original_Num!=0) {
			int digit = original_Num%10;
			reverse = (reverse*10)+digit;
			original_Num = original_Num/10;			
		}
		
		System.out.println("Reverse Number: " +reverse);

	}

}
