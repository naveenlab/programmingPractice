package com.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class CompareToLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet ts = new TreeSet();
		
		ts.add(new Student2(98,"Sri"));
		ts.add(new Student2(87,"Nivas"));
		ts.add(new Student2(89,"Dhande"));
		ts.add(new Student2(37,"SD"));
		ts.add(new Student2(87,"Abhi"));
		
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	
	}
	
	 

}


class Student2 implements Comparable{
int sid;
String name;
	Student2(int sid, String name){
		this.sid = sid;
		this.name = name;
	}
	
	
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student2) {
			Student2 st  = (Student2)obj;
			return this.sid-st.sid;
		}
		
		return 0;
	}
	
	public String toString() {
		return sid+ "\t" +name;
	}
}