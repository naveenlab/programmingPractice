import org.testng.Assert;

import files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Print No of courses returned by API
		JsonPath js = new JsonPath(payload.coursePrize());
		int courseSize = js.getInt("courses.size()");
		System.out.println(courseSize);
		
		
		//2.Print Purchase Amount
		int pursAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println(pursAmount);
		
		//Print Title of the first course
		String titleFirstCourse = js.get("courses[0].title");
		System.out.println(titleFirstCourse);
		
		//Print All course titles and their respective Prices
		for(int i = 0; i<courseSize; i++) {
		String title = js.get("courses["+i+"].title");
		int prices = js.getInt("courses["+i+"].price");
		System.out.println(title+"  "+prices);		
		}
		
		//Print no of copies sold by RPA Course
		for(int i = 0; i<courseSize; i++) {
			if(js.get("courses["+i+"].title").equals("RPA")) {
				int copies = js.getInt("courses["+i+"].copies");
				System.out.println(copies);
				break;
			}
			
		}
		
		
		//Verify if Sum of all Course prices matches with Purchase Amount
		int sum = 0;
		
		for(int i = 0; i<courseSize; i++) {
			int prices = js.getInt("courses["+i+"].price");
			int copies = js.getInt("courses["+i+"].copies");
			int result = prices*copies;
			sum = sum + result; 
			System.out.println(sum);
			
			
		}
		int tp =js.getInt("dashboard.purchaseAmount");
		Assert.assertEquals(sum, tp);
		
	}

}
