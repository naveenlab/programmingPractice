package FunctionProgramming4;

public interface B extends A{
	
 default void m2() {
	 System.out.println("B- m1() "); 
	 m1();

 }

}
