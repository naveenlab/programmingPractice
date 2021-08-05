package stepDefinations;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@DeletePlace")
	public void beforeScenario() throws IOException {
		//Write some code to get Place Id, Excute only if place id is null
		
		
		StepDefenitions m  = new StepDefenitions();
		if(StepDefenitions.place_id == null) {
			m.add_Place_Payload("Shetty", "French", "Manpur Gaya");
			m.user_calls_with_http_request("AddPlaceAPI", "POST");
			m.verify_place_id_created_maps_to_using("Shetty", "getPlaceAPI");
		}
		
		
	}

}
