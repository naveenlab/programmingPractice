package LamdaExpression2;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArr1 = {20, 30, 40, 23, 12};
		
		Hello hello1 = (arr) ->{
			for(int i=0; i<arr.length; i++) {
				for(int j = i+1; j<arr.length; j++) {
					if(arr[i]>arr[j]) {
						int temp = arr[i];
						arr[i]=arr[j];
						arr[j] = temp;
					}
				}
			}
		};
		
	 hello1.test(myArr1);
	
	 for(int x: myArr1) {
		 System.out.println(x);
	 }
	 System.out.println("==================================");
	 
	 int[] arr2 = {40, 39, 23, 45, 12, 32};
	 
	 Hello hello2 = Arrays::sort;
	 
	 hello2.test(arr2);
	 
	 for(int x: arr2) {
		 System.out.println(x);
	 }
	 System.out.println("==================================");

	}
}
