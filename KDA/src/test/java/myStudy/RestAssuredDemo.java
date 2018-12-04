package myStudy;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.*;
import io.restassured.internal.proxy.RestAssuredProxySelectorRoutePlanner;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class RestAssuredDemo {
  
  //@Test
  public void restAssuredMethod() 
  {
	RestAssured.baseURI = "http://localhost:8080";
  	RestAssured.given().auth().preemptive().basic("admin","admin1")
  	.when()
  	.get("/login")
  	.then()
  	.assertThat()
  	.statusCode(200); 
  	System.out.println("Test");

  }
  
  
  //@Test
  public void restAssuredPostDemo() 
  {
	
	RequestSpecification request =   RestAssured.given();//.auth().preemptive().basic("", "");
	request.headers("Content-Type","application/json");
	
	JSONObject jsonobj = new JSONObject();
	jsonobj.put("id", "100");
	jsonobj.put("title", "My Best Title");
	jsonobj.put("author", "Admin");
	
	
	request.body(jsonobj.toJSONString());
	Response res = request.post("http://localhost:3000/posts");
	
	int code = res.getStatusCode();
	Assert.assertEquals(code, 201);
  }
  
  
  //@Test
  public void restAssuredPutDemo() 
  {
	
	RequestSpecification request =   RestAssured.given();//.auth().preemptive().basic("", "");
	request.headers("Content-Type","application/json");
	
	JSONObject jsonobj = new JSONObject();
	jsonobj.put("id", "100");
	jsonobj.put("title", "My Best Title_Via_Put_Request");
	jsonobj.put("author", "Admin_Via_Put_Request");
	
	
	request.body(jsonobj.toJSONString());
	Response res = request.put("http://localhost:3000/posts/100");
	
	int code = res.getStatusCode();
	System.out.println("The Status Code "+code);
	Assert.assertEquals(code, 200);
  }
  
  @Test
  public void restAssuredDeleteDemo() 
  {
	
	RequestSpecification request =   RestAssured.given();//.auth().preemptive().basic("", "");	
	
	//JSONObject jsonobj = new JSONObject();
	//jsonobj.put("id", "100");
	//jsonobj.put("title", "My Best Title_Via_Put_Request");
	//jsonobj.put("author", "Admin_Via_Put_Request");
	
	
	//request.body(jsonobj.toJSONString());
	Response res = request.delete("http://localhost:3000/posts/100");
	
	int code = res.getStatusCode();
	System.out.println("The Status Code "+code);
	Assert.assertEquals(code, 200);
  }
  
}
