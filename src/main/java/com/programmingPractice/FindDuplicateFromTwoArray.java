package com.programmingPractice;

public class FindDuplicateFromTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {10, 20, 50, 50, 60, 70, 70};
		
		int j = 0;
		for(int i = 0; i < arr1.length-1; i++) {
			
				if(arr1[i]!= arr1[i+1]) {
					arr1[j] = arr1[i];
					j++;
				}
			
		}

		arr1[j] = arr1[arr1.length-1];
		
		for(int i =0; i < j+1; i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
