package LamdaExpression2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class MyNumber{
	
	public static boolean isEven(int num) {
		
		if(num%2==0)
			return true;
			else
				return false;
		
	}
	
public static boolean isOdd(int num) {
		
		if(num%2!=0)
			return true;
			else
				return false;
		
	}
}

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arrList = new ArrayList<>();
		arrList.add(10);
		arrList.add(30);
		arrList.add(3);
		arrList.add(56);
		arrList.add(67);
		arrList.add(12);
		arrList.add(91);
		arrList.add(7);
		System.out.println(arrList);
		
		Stream<Integer> stream  = arrList.stream();
		System.out.println(stream);
		stream.filter(MyNumber::isEven).forEach(System.out::println);
		Stream<Integer> stream2  = arrList.stream();
		stream2.filter(MyNumber::isOdd).forEach(System.out::println);
		
		arrList.stream().filter(a->a%2==0).forEach((a)->System.out.println(a));

		
		
	}

}
