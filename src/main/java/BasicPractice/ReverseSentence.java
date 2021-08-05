package BasicPractice;

import java.util.ArrayList;
import java.util.HashSet;

public class ReverseSentence {

	public static void main(String[] args) {
		String str = "I am Ganesh";
		//output should be "h se naGmaT"
		
		String reverse = "";
		for (int i = str.length() -1; i>=0;i--) {
			reverse = reverse + str.charAt(i);
			
		}
		
		System.out.println(reverse);
			
	}
}


