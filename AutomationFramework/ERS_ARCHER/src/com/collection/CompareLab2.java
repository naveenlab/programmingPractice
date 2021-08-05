package com.collection;

import java.util.TreeSet;

public class CompareLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		TreeSet ts = new TreeSet();
		
		ts.add(new Employee());
		ts.add(new Employee());
		ts.add(new Employee());
		ts.add(new Employee());
		ts.add(new Employee());

	}

}

class Employee implements Comparable{

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}}
