package BasicPractice;



class Parent {

	public void display(){
		System.out.println("Parent Display Method");	
	}
	
	 public void run(){
		System.out.println("Parent Run Method");	
	}
	
}
	public class Child extends Parent{
		
		 public void run() {
			System.out.println("Child Run Method");
		}
		
		
		public void walk() {
			System.out.println("Child walk Method");
		}
	}


