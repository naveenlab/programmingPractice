package BasicPractice;

class CustomizedException extends RuntimeException{
	
	public CustomizedException(String message) {
		super(message);
	}

	public static void main(String args[]) {
		
		int age = 17;
		
		if(age < 18) {
			throw new CustomizedException("Sorry, age should be greater than 18");
		}else {   
			System.out.println(age);
		}
		
	}
	
}