package com.collection;

import java.util.*;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;




public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String names[] = {"Java", "JavaSCript", "Java", "c"};
		
		
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		
		for(String name: names) {
			Integer count = storeMap.get(name);
			if(count == null) {
				storeMap.put(name, 1);
			}else {
				storeMap.put(name, ++count);
			}
		}
		
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		
		for(Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println("Duplicate:: "+entry.getKey());
			}
		}
		
		

	}

}
