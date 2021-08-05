package com.programmingPractice2;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
		int reverse = 0;
		
		
		while (num!=0) {
			int digit = num % 10;
			reverse = (reverse *10) + digit;
			num = num/10;
		}
		
		
		System.out.println("Reverse:  "+reverse);
		
		
		
	}

}
