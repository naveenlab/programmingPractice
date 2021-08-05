package com.programmingPractice2;

import java.util.HashMap;
import java.util.Map;

public class GetCountChar {

	public static void M(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Ramesha";
		
		char ch[] = str.toCharArray();
		
		HashMap<Character, Integer> hsMapCount = new HashMap<Character, Integer>();
		
		for(char c: ch) {
			if(hsMapCount.containsKey(c)) {
				hsMapCount.put(c, hsMapCount.get(c)+1);
			}else {
				hsMapCount.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry: hsMapCount.entrySet()) {
			System.out.println(entry.getKey()+"     "+entry.getValue());
		}

	}

}
