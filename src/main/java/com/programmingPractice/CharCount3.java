package com.programmingPractice;

import java.util.HashMap;
import java.util.Map.Entry;

public class CharCount3 {
	
	public static void main(String args[]) {
		
		String str = "Ganesha";
		char ch[]= str.toCharArray();
		
		HashMap<Character, Integer> hashMapCount = new HashMap<Character, Integer>();
		for(char c: ch) {
			if(hashMapCount.containsKey(c)) {
				hashMapCount.put(c, hashMapCount.get(c)+1);
			}else {
				hashMapCount.put(c,1);
			}
		}
		
		HashMap hs = new HashMap();
		for(Entry<Character, Integer> entry: hashMapCount.entrySet()) {
			hs.put(entry.getKey(), entry.getValue());
		}
		
		System.out.println(hs);
	}
}
