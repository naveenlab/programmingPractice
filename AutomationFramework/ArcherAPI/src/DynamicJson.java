import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import files.CommonHelper;
import files.payload;

public class DynamicJson {
	
	@Test(dataProvider = "getData")
	public static void addBooking(String ibsn, String alsn) {
	RestAssured.baseURI = "http://216.10.245.166";	
	String response = given().log().all().headers("Content-type", "application/json").body(payload.addBook(ibsn, alsn))
	.when().post("Library/Addbook.php").then().log().all().assertThat().statusCode(200).extract()
	.response().asString();
	
	JsonPath js = CommonHelper.rawToJson(response);
	String id = js.get("ID");
	System.out.println(id);
	}
	
	
	@DataProvider
	public Object[][] getData() {
		return new Object[][] {{"Chetan","123"}, {"viswas","12352"}, {"Deepak","908638"}};
	}

}
