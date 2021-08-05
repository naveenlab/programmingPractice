package com.programmingPractice;

public class ReverseStringWordByWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Java is fun";
		
		String arrStr[] = str.split(" ");
		
		String reverse = "";
		for(int i = arrStr.length-1; i >=0; i--) {
			
			reverse = reverse + arrStr[i] + " ";
			
		}
		
		System.out.println(reverse);

	}
	
	
	

}
