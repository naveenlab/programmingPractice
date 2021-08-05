Feature: Validating Place API

@AddPlace
Scenario Outline: Verify if place is being successfully added using AddPlaceAPI
	Given Add Place Payload "<name>" "<language>" "<address>"
	When User calls "AddPlaceAPI" with "POST" http request
	Then The API Call is success with status code 200
	And "status" in response body is "OK"
	And "scope" in response body is "APP"
	And Verify place_id created maps to "<name>" using "getPlaceAPI"
	
	Examples:
	|name   |language |address           |
	|AAHouse|English  |World Cross Centre|
#	|BBHouse|Spanish  |Sea Cross Centre  |

@DeletePlace
Scenario: Verify if Delete Place Functionality is working

	Given DeletePlace Payload
	When User calls "deletePlaceAPI" with "POST" http request
	Then The API Call is success with status code 200
	And "status" in response body is "OK"
	 