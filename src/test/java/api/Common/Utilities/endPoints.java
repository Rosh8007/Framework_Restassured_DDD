package api.Common.Utilities;

import org.testng.annotations.Test;

import api.endpoints.routes;
import api.payload.userPojoclass;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class endPoints {

	@Test
	public static Response creatUser(userPojoclass userpayload)
	{
		Response 	resp=RestAssured.given()
				.contentType(ContentType.JSON)
				.accept("application/json")
				.body(userpayload)
				.when()
				.post(routes.post_Uri);
		
		resp.then().assertThat().statusCode(200);

		return resp;

	}



}
