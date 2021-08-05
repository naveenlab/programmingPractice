package com.programmingPractice2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class getDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"Ram", "Ganesh", "Mukesh", "Ram"};
		
		Set<String> hs  = new HashSet<String>();
		for(String s : str) {
			if(!hs.add(s)) {
				System.out.println(s+ " ");
			}
		}
		
		
		

	}

}
