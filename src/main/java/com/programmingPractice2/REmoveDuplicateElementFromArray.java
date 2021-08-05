package com.programmingPractice2;

public class REmoveDuplicateElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr1[] = {10, 20, 30, 30, 40, 80, 90, 90};
		
		int temp[] = new int[arr1.length];
		int j = 0;
		for(int i = 0; i< arr1.length-1; i++) {
			if(arr1[i]!=arr1[i+1]) {
			temp[j] = arr1[i];
			j++;
			}
		}
		
		temp[j] = arr1[arr1.length-1];
		
		for (int n: temp) {
			if(n!=0)
			System.out.println(n+" ");
		}
		
		

	}

}
