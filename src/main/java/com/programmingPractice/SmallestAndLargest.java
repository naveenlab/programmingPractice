package com.programmingPractice;

public class SmallestAndLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10, 190, 7, 108, 12};
		int largest = a[0];
		int smallest = a[0];
		
		for (int i = 0; i<a.length; i++) {
			if(a[i] > largest) {
				largest = a[i];
			}
			if(a[i] < smallest) {
				smallest = a[i];
			}
			
		}
		
		System.out.println("Largest: "+largest+ "  Smallest: "+smallest);
		
		
				

	}

}
