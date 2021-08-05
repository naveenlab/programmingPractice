package com.programmingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[] = {"Manoj", "Dinesh", "Ganesh"};
		
		System.out.println("Array: "+Arrays.toString(str));
		System.out.println("List:  "+Arrays.asList(str));
		
		List ls  = new ArrayList();
		//other Method
		
		for(int i = 0; i<str.length;i++) {
			ls.add(str[i]);
		}
		
		System.out.println(ls);
		System.out.println("====================================");
		
		Iterator itr = ls.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		
		
		

	}

}
