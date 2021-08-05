package Files;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class DynamicJson {

	@Test(dataProvider = "Bookdata")
	public void addBook(String isbn, String aisle) {
		RestAssured.baseURI = "http://216.10.245.166";
		String response = given()
				.header("Content-Type", "application/json")
				.body(Payload.addbook(isbn, aisle))
		.when()
			.post("/Library/Addbook.php")
		.then()
			.assertThat().log().all()
			.statusCode(200)
			.extract().response()
		.asString();
		
		JsonPath js = ReusableMethods.rawToJson(response);
		String id = js.getString("ID");
		
		System.out.println(id);
		
	}
	
	@DataProvider(name = "Bookdata")
	public Object[][] getData(){
		
		return new Object[][] {{"jgfs", "3648"}, {"jjds", "7634"}, {"erlk", "0987"}};
	}
}
