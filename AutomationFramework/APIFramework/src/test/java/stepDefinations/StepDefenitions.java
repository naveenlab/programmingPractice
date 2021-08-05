package stepDefinations;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.AddPlace;
import pojo.Location;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;



public class StepDefenitions extends Utils{
	
	ResponseSpecification resspec;
	RequestSpecification res;
	Response response;
	static String place_id;
	JsonPath js;
	
	TestDataBuild data = new TestDataBuild();
	
	@Given("Add Place Payload {string} {string} {string}")
	public void add_Place_Payload(String name, String language, String address) throws IOException {
		res = given().spec(requestSpecification())
		.body(data.addPlacePayload(name, language, address));
	}

	@When("User calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String method) {
		
		APIResources resourceAPI = APIResources.valueOf(resource);
		System.out.println(resourceAPI.getResource());
		
		resspec= new ResponseSpecBuilder().expectStatusCode(200).expectContentType("application/json").build();
		if(method.equalsIgnoreCase("POST")) 
		    response =res.when().post(resourceAPI.getResource());
		else if(method.equalsIgnoreCase("GET"))
			response =res.when().get(resourceAPI.getResource());
		else if(method.equalsIgnoreCase("DELETE"))
			response =res.when().delete(resourceAPI.getResource());
				
		
	}

	@Then("The API Call is success with status code {int}")
	public void the_API_Call_is_success_with_status_code(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(response.getStatusCode(), 200);
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyValue, String Expectedvalue) {
	    // Write code here that turns the phrase above into concrete actions
	    
	    assertEquals(getJsonPath(response, keyValue), Expectedvalue);
	    	    
	}
	
	
	@Then("Verify place_id created maps to {string} using {string}")
	public void verify_place_id_created_maps_to_using(String expectedName, String resource) throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		place_id=getJsonPath(response, "place_id");
		res = given().spec(requestSpecification()).queryParam("place_id", place_id);
		user_calls_with_http_request(resource, "GET");
		String actualName=getJsonPath(response, "name");
		assertEquals(actualName, expectedName);
		
	}
	
	
	@Given("DeletePlace Payload")
	public void deleteplace_Payload() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	 res= given().spec(requestSpecification())
	   .body(data.deletePlayLoad(place_id));
	}





}