import Files.Payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsonPath js = new JsonPath(Payload.coursePrice());
		
	int count = js.getInt("courses.size()");
	System.out.println(count);
	
	int purchaseAmount = js.getInt("dashboard.purchaseAmount");
	System.out.println(purchaseAmount);
	
	String firstTitleCourse = js.get("courses[0].title");
	System.out.println(firstTitleCourse);
	
	String secTitleCourse = js.get("courses[2].title");
	System.out.println(secTitleCourse);
	
	
	
	for(int i = 0; i <count; i++) {
	String courseTitle = js.get("courses["+i+"].title");
	System.out.println(courseTitle);
	}
	
	System.out.println("Print no of copies for RPA");
	
	for(int i = 0; i <count; i++) {
		String courseTitle = js.get("courses["+i+"].title");
		if(courseTitle.equalsIgnoreCase("RPA")) {
	int noOfCopiesForRPA = js.get("courses["+i+"].copies");
	System.out.println(noOfCopiesForRPA);
	break;
		}
		
	}

}
	
}
