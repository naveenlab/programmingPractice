package com.programmingPractice;

import java.util.HashMap;
import java.util.Map;

public class GetCount   {
	
public static void main(String args[]) {
	
	
	String str = "Ganeshs";
	HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
	char[] charString = str.toCharArray();
	
	
	for(char c : charString) {
		if(charCountMap.containsKey(c)) {
			charCountMap.put(c, charCountMap.get(c)+1);
		}else {
			charCountMap.put(c, 1);
		}
		
	}
	
	for(Map.Entry entry: charCountMap.entrySet() ) {
		System.out.println(entry.getKey()+ "   "+ entry.getValue());
	}
		

}
}
