package com.collection;

import java.util.*;


public class Lab801 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List ls = new ArrayList();
		ls.add("Ram");
		ls.add("Ganesh");
		ls.add("Mukesh");
		ls.add("Venkat");
		ls.add("Shashi");
		
		ListIterator It = ls.listIterator();
		while(It.hasNext()) {
			Object obj = It.next();
			if(obj.equals("Venkat")) {
			It.remove();
			}
			else if(obj.equals("Shashi")) {
				It.add("ShashiLeft");
			}
			else if(obj.equals("Ram")) {
				It.set("Rahim");
			}
			
		}
		
		System.out.println(ls);
		
		
		System.out.println("=====Backward===========");
		
		while(It.hasPrevious()) {
			int index = It.previousIndex();
			Object obj2 =It.previous();
			
			System.out.println(index+"  "+obj2);
		}
		
	}
			
}		
		
	


