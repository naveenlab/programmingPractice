package StaticMethodExample;

import static org.testng.Assert.assertThrows;

public class Demo {

	public static void main(String[] args) {
		System.out.println("main begin");
		Hello hello1 = (a,b) -> {
			System.out.println("Lamda Begins");
			int result = a/b;
			System.out.println("result: "+result);
			System.out.println("Lamda ENds");
		};
		
		try {
			hello1.test(20, 0);
		}catch (Exception e) {
			System.out.println("Exception caght");
		}
		
		System.out.println("Main Ends");
		
		
	
	}

}
