package api.endpoints;

public class routes {
	
	//https://petstore.swagger.io/v2/user/createWithList
    //Get:=https://petstore.swagger.io/v2/user/user1
	//PUT:=https://petstore.swagger.io/v2/user/string
	//DELETE:=https://petstore.swagger.io/v2/user/username
	//POST:=https://petstore.swagger.io/v2/user


	
	
	public static String base_uri="https://petstore.swagger.io/v2";
	
	public static String get_Uri=base_uri+"/user/{username}";
	
	public static String put_Uri=base_uri+"/user/{username}";
	
	public static String post_Uri=base_uri+"/user";
	
	public static String  delete_uri=base_uri+"/user/{username}";

	
	
}
