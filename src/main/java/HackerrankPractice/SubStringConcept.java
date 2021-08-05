package HackerrankPractice;

import java.util.Scanner;

public class SubStringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        String S = in.next();
	        int start = in.nextInt();
	        int end = in.nextInt();
	        String str = "";
	        char[] ch =  S.toCharArray();
	        for(int i = start; i<=end-1; i ++){
	        	str = str + ch[i];
	        }
	        
	        System.out.println(str);

	}

}
