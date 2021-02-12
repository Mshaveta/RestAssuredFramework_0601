package api_testClasses.REQRES;
 
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utility.CommonFuncs;

import static resources.ReqRes_resource.*;

import static payloads.ReqRes_paylod.*;

import static utility.ReadPropertyFile.*;
import static io.restassured.RestAssured.*;

public class AddUser {
	@Test
	public void addNewUser() {
		RestAssured.baseURI = readProperty("baseapiuri");
		Response  response = given()
							.body(addUserPayload())
							.headers("Content-Type", readProperty("req_content_Type") )
						  .when()
						  	.post(ADDUSER_RSC)
						  .then()
						  	.extract()
						  	.response();
		
		JsonPath jp = CommonFuncs.convertRawToJson(response);
		 System.out.println(jp.get("name"));
		 
	}
}
