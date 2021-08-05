package com.programmingPractice2;


import java.util.Arrays;


public class SOrtArrayByCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 3, 323, 45, 11, 342};
		
		Arrays.sort(arr);
		for(int a : arr) {
			System.out.println(a);
		}
		
		System.out.println("3rd Largest Number:  "+arr[arr.length-3]  );
		
		
		

	}

}
