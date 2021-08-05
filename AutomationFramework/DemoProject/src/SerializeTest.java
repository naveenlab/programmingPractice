import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import Files.Payload;
import Files.ReusableMethods;
import Pojo.AddPlace;
import Pojo.Location;



public class SerializeTest {
	
	public static void main(String args[]) {
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		AddPlace p = new AddPlace();
		p.setAccuracy(50);
		p.setName("Frontline house");
		p.setPhone_number("(+91) 983 893 3937");
		p.setAddress("29, side layout, cohen 09");
		p.setWebsite("https://rahulshettyacademy.com");
		List<String> myList = new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");
		
		p.setTypes(myList);
		
		Location loc = new Location();
		loc.setLat(-38.383494);
		loc.setLng(33.427362);
		p.setLocation(loc);
		
		Response res = given()
		.queryParam("key", "qaclick123")
		.body(p)
		.when()
		.post("/maps/api/place/add/json")
		.then()
		.assertThat().statusCode(200).extract().response();
		
		String response = res.asString();
		System.out.println(response);
	}

	
	
}
