package BasicPractice;

interface MyInface1{
	
	public static int a = 10;
	public default void display() {
		System.out.println("My one Interface1");
	}
	
}

interface MyInface2{
	
	public static int a = 20;
	public default void display() {
		System.out.println("My one Interface2");
	}
	
}

public class InterfaceExample2 implements MyInface1, MyInface2{
		
	public void display() {
	      System.out.println("This is the implementation of the display method");
	   }
	public void show() {
		//MyInface1.display();
		MyInface2.super.display();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample obj = new InterfaceExample();
		obj.display();
		obj.show();
	}

}
