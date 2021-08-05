package com.programmingPractice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		String rev = "";
		
		for(int i= str.length()-1; i>=0; i-- ) {
			rev = rev + str.charAt(i);
		}
		
		System.out.println("Reverse: "+rev);
		if(str.equals(rev)) {
			System.out.println("Equal");
		}
		else{
			System.out.println("Not Equal");
		}
	}

	
}
