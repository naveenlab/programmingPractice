package com.programmingPractice;

public class SortArray {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {106, 1, 67, 3, 80, 6, 109};
		
		for(int i = 0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
					
				}
				
				
			}
			System.out.println(arr[i]);
			
		}
		
		
		System.out.println("3rd Largest Number"+ arr[arr.length - 3]);
		

	}

}
