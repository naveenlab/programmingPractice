package com.programmingPractice2;

import java.util.HashSet;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"Ganesh", "Rajesh", "Ganesh", "Mahesh"};
		
		
		HashSet<String> hs = new HashSet<String>();
		for(String s: str) {
			hs.add(s);
		}
		
		
		
		System.out.println(hs);
		

	}

}
