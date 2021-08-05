package com.programmingPractice;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Java is fun";
		//output: avaJ si nuf;
		
		String strArr[] = str.split(" ");
		String totalRev = "";
		for (String s : strArr) {
			String wordVerse = "";
			for (int i = s.length()-1; i>=0; i--) {
				wordVerse = wordVerse + s.charAt(i);
			}
			
			totalRev = totalRev + wordVerse + " ";
		}
		
		System.out.print(totalRev);
		

	}

}
