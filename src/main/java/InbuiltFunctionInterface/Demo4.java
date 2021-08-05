package InbuiltFunctionInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		
		List<Integer> mylist1 = new ArrayList<>();
		mylist1.add(20);
		mylist1.add(21);
		mylist1.add(22);
		mylist1.add(23);
		mylist1.add(24);
		mylist1.add(25);
		mylist1.add(26);
		mylist1.add(27);
		mylist1.add(28);
		
		System.out.println(mylist1);
		mylist1.removeIf((num) -> num % 2==0);
		System.out.println(mylist1);
		
		System.out.println("=======================================================");
		
		List<Integer> mylist2 = new ArrayList<>();
		mylist2.add(20);
		mylist2.add(21);
		mylist2.add(22);
		mylist2.add(23);
		mylist2.add(24);
		mylist2.add(25);
		mylist2.add(26);
		mylist2.add(27);
		mylist2.add(28);
		
		System.out.println(mylist2);
		mylist2.removeIf((num) -> num % 2!=0);
		System.out.println(mylist2);
		
		
		
	}

}
