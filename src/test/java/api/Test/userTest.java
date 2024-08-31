package api.Test;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.Common.Utilities.DataPoviders;
import api.Common.Utilities.endPoints;
import api.payload.userPojoclass;
import io.restassured.response.Response;


public class userTest {

	userPojoclass userPayload;
	
	Faker fake;



	@Test(priority=1,dataProvider = "AllData", dataProviderClass = DataPoviders.class)
	public void testCreateUser(String userId, String UserName, String fname, String lname, String email, String pwd, String phone)
	{
		fake=new Faker();
		userPayload = new userPojoclass();

		System.out.println(UserName);
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(email);
		System.out.println(pwd);
		System.out.println(phone);

		userPayload.setId(fake.idNumber().hashCode());
		userPayload.setUsername(UserName);
		userPayload.setFirstname(fname);
		userPayload.setLastname(lname);
		userPayload.setEmail(lname);
		userPayload.setPassword(email);
		userPayload.setPhone(phone);


		Response response = endPoints.creatUser(userPayload);

		//log response
		response.then().log().all();
	}

}
