package com.skillenza.qa;

class AppTest{
	
	public static void main(String args[]) {
		
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
		System.out.println("================================================");
		
		System.out.println(arr[1]);
		
		String name1 = "Pinku";
		String name2 = "Pinku";
		String name3 = "Pinku";
		
		name2 = name2.concat("Kumar");
		System.out.println(name2);
		System.out.println(name1);
		System.out.println(name3);
		
		
	}
	
}