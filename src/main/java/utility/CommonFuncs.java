package utility;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CommonFuncs {
	public static JsonPath convertRawToJson(Response response) {
		String strResponse = response.asPrettyString();
		JsonPath jp = new JsonPath(strResponse);
		return jp;
		 
	}
}
