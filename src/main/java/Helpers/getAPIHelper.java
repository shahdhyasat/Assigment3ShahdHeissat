package Helpers;
import Helpers.requestValidator;
import apiObjects.loginResponseObject;
import customExceptions.invalidRequestResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;public class getAPIHelper {


   public static Response get(String apiUrl,String token) {
        if (requestValidator.isNotNullOrEmpty(apiUrl)) {
           return RestAssured.given().that().headers("Content-Type", "application/json", "Cookie", "Orange=!Xg5TUaoVd6nDbQuiMddB4OzwWfBKTBsbnnTEu99gggDIxC5LVkvj+BnXio+wOM3T64GsFFKJZl5VfIE=","x-api-key","GfqP7b2I99sUMkbxGEk5Xk56RscaWRuo","Authorization","Bearer"+ " " +token ).when().get(apiUrl).thenReturn();

        } else {
          try {
                throw new invalidRequestResponse("invalid request response");
            } catch (invalidRequestResponse e) {
                e.printStackTrace();
            }


        }
        return null;
   }

}