package com.programmingPractice;

import java.util.HashMap;
import java.util.Map.Entry;

public class CharOccurance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Ganesha";
		char[] ch  = str.toCharArray();
		
		HashMap<Character, Integer> hashMapCOunt = new HashMap<Character, Integer>();
		
		for(char c: ch) {
			if(hashMapCOunt.containsKey(c)) {
				hashMapCOunt.put(c, hashMapCOunt.get(c)+1);
			}else {
				hashMapCOunt.put(c,1);
			}
			
		}
		
		HashMap mp = new HashMap();
		for (Entry<Character, Integer> entry : hashMapCOunt.entrySet()) {
			mp.put(entry.getKey(), entry.getValue());		
			}
		System.out.println(mp);
		

	}

}
