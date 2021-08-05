package LamdaExpression2;

import java.util.ArrayList;
import java.util.List;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ls  = new ArrayList<>();
		ls.add(3);
		ls.add(2);
		ls.add(5);
		ls.add(1);
		ls.add(4);
		ls.add(6);
		ls.add(7);
		ls.add(8);
		
		ls.stream().filter(a->a%2==0).map(a->a*a).forEach(a->System.out.println(a));
	}

}
