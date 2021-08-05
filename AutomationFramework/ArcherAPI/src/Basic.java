import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;

import files.CommonHelper;
import files.payload;

public class Basic {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		String updatedAddress = "Summer Walk, Africa";
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key", "qaclick123").headers("Content-type","application/json")
		.body(new String(Files.readAllBytes(Paths.get("C:\\Users\\navee\\Desktop\\addLocation.json")))).when().post("/maps/api/place/add/json").then().log().all().assertThat().statusCode(200)
				.body("scope", equalTo("APP")).header("Server", equalTo("Apache/2.4.18 (Ubuntu)")).extract().response().asString();
		
		//add place - update new place - get place if new address is pesent in the response
		
		System.out.println(response);
		JsonPath js = new JsonPath(response);// parsing json response
		   String placeid = js.getString("place_id");
		   System.out.println(placeid);
		   
		   
		   // update place
		   
		   given().log().all().queryParam("key", "qaclick123").header("Content-type","application/json")
		   .body("{\r\n" + 
		   		"\"place_id\":\""+placeid+"\",\r\n" + 
		   		"\"address\":\""+updatedAddress+"\",\r\n" + 
		   		"\"key\":\"qaclick123\"\r\n" + 
		   		"}").put("/maps/api/place/update/json").then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
		   
		   
		   
		   //get new updated address
		   
		   String getPlaceResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeid).when().get("/maps/api/place/get/json").then().assertThat().log().all().statusCode(200).extract()
		   .response().asString();
		   
		   //json Parsing
		   JsonPath js1 = CommonHelper.rawToJson(getPlaceResponse);
		   String actualAddress = js1.getString("address");	
		   Assert.assertEquals(actualAddress, updatedAddress);
	}

}
