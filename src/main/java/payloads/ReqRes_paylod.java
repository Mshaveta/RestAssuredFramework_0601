package payloads;

public class ReqRes_paylod {
	public static String addUserPayload() {
		String add_user_payload = "{\r\n" + 
				"    \"name\": \"tester\",\r\n" + 
				"    \"job\": \"SDET\"\r\n" + 
				"}";
		return add_user_payload;
	}
}
