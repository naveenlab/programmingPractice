package BasicPractice;


//Create class reference variable and assign it to null
//create public String variable and doot assign any value
//Create private constructor and intialize the str
//create getPattern with class type return and write the logic.


public class SingletonPattern {

	private static SingletonPattern sp = null;
	
	public String str;
	
	private SingletonPattern() {
		str = "I am Naveen";
	}
	
	private static SingletonPattern getPattern() {
		if(sp==null)
			sp = new SingletonPattern();
		return sp;
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonPattern sp1 = SingletonPattern.getPattern();
		SingletonPattern sp2 = SingletonPattern.getPattern();
		SingletonPattern sp3 = SingletonPattern.getPattern();
		
		System.out.println(sp1.str);
		System.out.println(sp2.str);
		System.out.println(sp3.str);
		sp3.str = "Name Changed, now my name is Naveenan Lala";
		System.out.println(sp1.str);
		System.out.println(sp2.str);
		System.out.println(sp3.str);
		

	}

}
