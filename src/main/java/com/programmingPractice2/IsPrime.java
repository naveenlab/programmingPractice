package com.programmingPractice2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 19;
		boolean flag = true;
		if(num==0 || num==1) {
			System.out.println("Not Prime Number");
		}
		else if(num >=2){
			for(int i = 2; i <= num/2; i++) {
				if(num%i==0) {
					flag = false;
					break;
				}
			}
		
			if(flag) {
				System.out.println("prime Number");
			}else {
				System.out.println("Not prime Number");
			}
			
		}
		
		

	}

}
