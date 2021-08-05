package com.programmingPractice;

import java.util.HashSet;

public class RemoveDuplicateElementfromListOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strArr[] = {"Ram", "Ganesh", "Mukesh", "Raj", "Mukesh"};
		HashSet hs = new HashSet();
		
		for(String str: strArr) {
			if(!hs.contains(str)) {
				hs.add(str);
			}
		}
		
		System.out.println(hs);

	}

}
