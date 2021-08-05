package com.programmingPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FIndDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"Ram", "shyam", "ganesh", "shyam", "Prabhudev", "Ram"};
		HashSet<String> hs = new HashSet<String>();
		Set<String> al  = new HashSet<String>();
		
		for(String s: str) {
			if(!hs.add(s)) {
				
				al.add(s);
			}
			
		}
		System.out.println("Duplicate:" +al);
		

	}

}
