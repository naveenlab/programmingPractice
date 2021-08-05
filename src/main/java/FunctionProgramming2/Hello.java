package FunctionProgramming2;

import org.testng.annotations.Test;

public class Hello implements A,B {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Hello -> Show()");
		
	}
	
	public void test() {
		System.out.println("Hello - test()");
		show();//Hello -> Show()
		A.super.show();//A -> Show()
		B.super.show();//B -> Show()
		
		
	}
	
	
	

}
