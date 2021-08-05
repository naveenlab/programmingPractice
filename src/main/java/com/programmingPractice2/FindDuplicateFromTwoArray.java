package com.programmingPractice2;

import java.util.HashSet;

public class FindDuplicateFromTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {10, 20, 30, 8, 100, 30};
		int arr2[] = {20, 10, 12, 18, 12, 30};
		
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (int i = 0; i< arr1.length; i++) {
			for(int j = 0; j<arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					hs.add(arr1[i]);
				}
			}
		}
		
		
		for(int s : hs) {
			System.out.print(s+ " ");
		}
		
		
	}
	
}
