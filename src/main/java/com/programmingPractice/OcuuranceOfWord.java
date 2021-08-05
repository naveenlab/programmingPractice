package com.programmingPractice;

import java.util.HashMap;
import java.util.Map;

public class OcuuranceOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String paragraph = "Ram is going for Ram father in covid hospital";
		String[] names= paragraph.split(" ");
		
		String[] name = {"Ram", "Ganesh", "Ram", "Shyam", "Dinesh"};
		
		HashMap<String, Integer> WordCOuntMap = new HashMap<String, Integer>();
		
		for(String str: names ) {
			if(WordCOuntMap.containsKey(str)) {
				WordCOuntMap.put(str, WordCOuntMap.get(str)+1);
			}
			else
			{
				WordCOuntMap.put(str, 1);
			}
		}
		
		for(Map.Entry entry : WordCOuntMap.entrySet()) {
			System.out.println(entry.getKey()+"   "+entry.getValue());
		} 

	}

}
