package com.programmingPractice;

public class FindDuplicateStringFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[] =  {"Ram","Java", "Ram", "Ganesh", "Ganesh"};
		
		for(int i = 0; i <=str.length-1; i++) {
			for (int j = i+1;j <=str.length-1; j++) {
				if(str[i]==str[j]) {
					System.out.println(str[i]);
				}
			}
		}

	}

}
