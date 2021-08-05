import org.testng.Assert;
import org.testng.annotations.Test;

import Files.Payload;
import io.restassured.path.json.JsonPath;

public class SumValidation {
	
	@Test
	public void sumOfCourse() {
		int sum =0;
		JsonPath js = new JsonPath(Payload.coursePrice());
		int count = js.getInt("courses.size()");
		System.out.println(count);
		
		for(int i = 0; i<count; i++) {
			int price = js.getInt("courses["+i+"].price");
			int copies = js.getInt("courses["+i+"].copies");
			System.out.println(price*copies);
			sum = sum + price*copies;
		}
		
		System.out.println("sum ="+sum);
		
		int expectedsum = js.getInt("dashboard.purchaseAmount");
		
		Assert.assertEquals(sum, expectedsum);
	}

}
