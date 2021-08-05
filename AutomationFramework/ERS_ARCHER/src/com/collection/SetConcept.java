package com.collection;

import java.util.*;

public class SetConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs = new HashSet();
		hs.add("Ram");
		hs.add("Ganesh");
		hs.add("bhim");
		hs.add(99);
		System.out.println(hs);
		
		LinkedHashSet Lhs = new LinkedHashSet();
		Lhs.add("Ram");
		Lhs.add("Ganesh");
		Lhs.add("bhim");
		Lhs.add(99);
		System.out.println(Lhs);
		
		TreeSet ts = new TreeSet();
	
		ts.add("Ganesh");
		ts.add("bhim");
		
		System.out.println(ts);
	
		LinkedHashSet Lhs1 = new LinkedHashSet();
		Lhs1.add(new Student(56));
		System.out.println(Lhs1);

	}

}

class Student{
	int sid;
	
	public Student(int sid) {
		this.sid = sid;
	}
	
	
	public String toString() {
		return ""+sid;
	}
}
