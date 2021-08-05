package com.programmingPractice;

public class RemoveDuplicateElementWithoutCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10, 30, 2, 10, 5, 2, 10};
		int[] output = new int[a.length-1];
		int k =0;
		for(int i = 0; i<= a.length-1; i++) {
			for(int j = 0;j<= a.length-1; j++) {
				if(a[i]==a[j+1]) {
					output[k] = a[i];
					k++;
				}
			}
		}
		
		output[k] = a[a.length-1];
		for(int i = 0; i< k;i++) {
			System.out.println(output[i]);
		}
		

	}

}
