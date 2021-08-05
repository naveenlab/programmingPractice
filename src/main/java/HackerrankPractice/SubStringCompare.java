package HackerrankPractice;

import java.util.Scanner;

public class SubStringCompare {


	public static String getSmallestAndLargest(String s, int k) {
		
		
		String substring = s.substring(0, k);
		String smallest = substring;
		String largest = substring;
		
		for(int i = 1; i <=s.length()-k; i++) {
			substring = s.substring(i,i+k);
			if(substring.compareTo(smallest)< 0) {
				smallest = substring;
			}
			if(substring.compareTo(largest)>0) {
				largest = substring;
			}
		}
		
		
		
		return smallest + "\n" + largest;

	}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}