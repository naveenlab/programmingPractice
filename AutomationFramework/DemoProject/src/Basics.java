import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import Files.Payload;
import Files.ReusableMethods;



public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Validate if add place is working as expected.
		//Given - All input details
		//When - Submit the response
		//Then - Validate the response
		
		String newAddress = "Summer walk, Africa";
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response = given()  
		.log().all()
		.queryParam("key", "qaclick123")
		.header("Content-Type","application/json")
		.body(Payload.AddPlace())
		.when()
		.post("/maps/api/place/add/json")
		.then().log().all()
		.assertThat().statusCode(200)
		.body("scope", equalTo("APP"))
		.header("server", "Apache/2.4.18 (Ubuntu)")
		.extract().response().asString();
		
		System.out.println("===============================");
		System.out.println(response);
		
		JsonPath js  = new JsonPath(response);// for passing json
		String placeId = js.getString("place_id");
		System.out.println(placeId);
		// Add Place -> Update place with New Address  - > Get Place to validate if New Address is present in response
		
		//Update PLace
		given().log().all()
			.queryParam("key", "qaclick123")
			.header("Content-Type","application/json")
			.body("{\r\n" + 
					"\"place_id\":\""+placeId+"\",\r\n" + 
					"\"address\":\""+newAddress+"\",\r\n" + 
					"\"key\":\"qaclick123\"\r\n" + 
					"}\r\n" + 
					"")
		.when()
		.put("maps/api/place/update/json")
		.then()
		.assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		
		String getPlaceResponse = given()
		.log().all()
		.queryParam("key", "qaclick123")
		.queryParam("place_id", placeId) 
		.when()
		.get("/maps/api/place/get/json")
		.then()
		.assertThat().log().all().statusCode(200).extract().response().asString();
		
		JsonPath js1 = ReusableMethods.rawToJson(getPlaceResponse);
		String actualAddress = js1.getString("address");
		Assert.assertEquals(actualAddress, newAddress);
	}

}

