package com.programmingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateStringFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[]= {"Ram", "Ganesh", "Ram", "Dinesh"};
		
		List ls = Arrays.asList(str);
		
		System.out.println(ls);
		for(int i = 0; i<=str.length-1; i++) {
			for(int j = 0; j<=str.length-1; j++) {
				
				if(str[i]==str[j]) {
				ls.remove(i);
				}
				
			}
			
			
		}
		System.out.println(ls);
		
	}

}
