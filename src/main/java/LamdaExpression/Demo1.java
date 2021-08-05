package LamdaExpression;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 Lamda Style
		
		Hello hello1 = (a,b,c,d)->{
			Course course = new Course(a,b,c,d);
			return course;
		};
		
		Course course1 = hello1.test(101, "Devops", "60 Hours", "Sri Nivas Dande");
		System.out.println(course1);
		
		Hello hello2 = Course::new;
		
		Course course2 = hello2.test(102, "Devops", "60 Hours", "Sri Nivas Dande");
		
		System.out.println(course2);
				
	}
}
