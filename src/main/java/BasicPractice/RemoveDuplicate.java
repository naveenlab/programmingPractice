package BasicPractice;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10, 20, 10, 30, 20};
		int output[] = new int[a.length];
		int count = 0;
		int num = 0;
		
		for(int i = 0; i< a.length;i++) {
			num = a[i];
			boolean flag=check(output, num);
			if(flag == false) {
				output[count] = num;
				++count;
			}
		}
		
		for(int i: output) {
			if(i!=0) {
				System.out.println(i+" ");
			}
		}
	}
	
	
	
	public static boolean check(int[] arr, int num) {
		boolean flag  = false;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==num)
	        {
	            flag = true;
	            break;
	        }
		}
		
		
		return false;
		
	}

}
 