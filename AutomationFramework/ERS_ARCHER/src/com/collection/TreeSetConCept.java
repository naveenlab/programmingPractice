package com.collection;

import java.util.*;

public class TreeSetConCept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(50);
		ts.add(80);
		ts.add(30);
		ts.subSet(1, 3);
		System.out.println(ts.headSet(50));
		Set ts1 = ts.descendingSet();
		System.out.println(ts1);
		System.out.println("*******************ASCENDING ORDER******************");
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("*******************DESC ORDER******************");
		Iterator it2 = ts.descendingIterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
		
		
		
		
	}

}
