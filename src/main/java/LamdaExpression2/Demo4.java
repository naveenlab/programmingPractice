package LamdaExpression2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Hello4{
	public static void show(int x) {
		System.out.println(x*x);
	}
}




public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> mylist = new ArrayList<>();
		mylist.add(30);
		mylist.add(20);
		mylist.add(50);
		mylist.add(10);
		mylist.add(40);
		
		Stream<Integer> mystream = mylist.stream();
		mystream.forEach(Hello4::show);
		
		mylist.stream().forEach(Hello4::show);
		
		mylist.stream().forEach(System.out::println);
		
		mylist.stream().forEach((x)->System.out.println(x));
	}

}
