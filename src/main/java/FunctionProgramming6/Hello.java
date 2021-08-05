package FunctionProgramming6;

public class Hello implements A{
	
	public void test() {
		System.out.println(P);//Inherited
		System.out.println(Q);//inherited
		m1(); //overridden
		m2(); //overridden
		m3();//overridden
		
		A.super.m3();
		m4();//Overridden 
		A.super.m4();
		A.m5();
		A.m6();
		//A.super.m6(); Not Allowed
		
	}
	
	@Override 
	 public void m1() { 
	 System.out.println("Hello -m1"); 
	 }
	
	
	
	@Override 
	 public void m2() { 
	 System.out.println("Hello -m2"); 
	 }
	
	@Override
	 public void m3() { 
	 System.out.println("Hello -m3"); 
	 
	 }
	
	@Override
	 public void m4() { 
	 System.out.println("Hello -m4"); 	 
	 }
	
	
	 
	 
	 public static void m5() { 
	 System.out.println("Hello -m5"); 
	 } 
	 

}
