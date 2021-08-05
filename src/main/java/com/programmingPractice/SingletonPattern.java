package com.programmingPractice;

public class SingletonPattern {
	private static SingletonPattern sp = null;
	
	public String str;
	
	private SingletonPattern() {
		str = "I am Naveen";
		
	}
	
	
	public static SingletonPattern getPattern() {
		if(sp == null)
			sp = new SingletonPattern();
		return sp;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonPattern sp1 = SingletonPattern.getPattern();
		SingletonPattern sp2 = SingletonPattern.getPattern();
		SingletonPattern sp3 = SingletonPattern.getPattern();
		sp1.str = "Ganesh";
		System.out.println(sp1.str);
		System.out.println(sp3.str);
		System.out.println(sp2.str);
		
		
	}

}
