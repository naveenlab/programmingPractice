package com.programmingPractice;

public class ReverseStringMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Mamla";
		char ch[] = str.toCharArray();
		String strRev = "";
		for(int i = ch.length-1;i>=0;i--) {
			strRev = strRev+ch[i];
		}
		
		System.out.println("revesre: "+strRev);
	}

}
