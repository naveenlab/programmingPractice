package BasicPractice;

class Singleton{
	
	
	private static Singleton sp = null;
	public String str;
	private Singleton() {
		 str = "Ram";
	}
	
	private static Singleton getPattern() {
		if(sp == null) {
			sp = new Singleton();
		}
		return sp;
	}
	
	
	public static void main(String args[]) {
		Singleton s1 = Singleton.getPattern();
		Singleton s2 = Singleton.getPattern();
		Singleton s3 = Singleton.getPattern();
		System.out.println(s1.str);
		System.out.println(s2.str);
		System.out.println(s3.str);
		s1.str = "Ganesh";
		System.out.println("=============================");
		System.out.println(s1.str);
		System.out.println(s2.str);
		System.out.println(s3.str);
		
		
		
	}
	
}
