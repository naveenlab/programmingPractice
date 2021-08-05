package InbuiltFunctionInterface;

import java.util.function.Predicate;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> predicate1 = (num)->{
			System.out.println(num);
			return num%2==0;
		};
		
		boolean flag = predicate1.test(3);
		System.out.println(flag);
		
		
		Predicate<Integer> predicate2 = (num)->num%2!=0;
		
		
		boolean flag2 = predicate2.test(3);
		System.out.println(flag2);
		
		
	}

}
