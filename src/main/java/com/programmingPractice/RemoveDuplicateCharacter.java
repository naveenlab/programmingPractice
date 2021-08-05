package com.programmingPractice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String str = "java";
		char ch[] = str.toCharArray();
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<ch.length-1; i++) {
			boolean repeated = false;
			for(int j=i+1; j<ch.length-1; j++) {
				if(ch[i]==ch[j]) {
					repeated = true;
					break;
				}
			}
			
			if(!repeated) {
				sb.append(ch[i]);
			}
		}
		
		System.out.println(sb);
		
	}

}
