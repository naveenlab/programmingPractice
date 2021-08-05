package FunctionProgramming;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog myDog = new Dog();
		myDog.eating();//overridden
		myDog.waliking();//overridden
		myDog.running();//overridden
		myDog.learning();//inherited default

		
		Cat myCat  = new Cat();
		myCat.eating();//overridden
		myCat.waliking();//overridden
		myCat.running();//inherited default method
		myCat.learning();//overridden
		
	}

}
