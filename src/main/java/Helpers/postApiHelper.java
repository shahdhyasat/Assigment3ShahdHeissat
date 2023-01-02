package Helpers;

import customExceptions.invalidRequestResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;

public class postApiHelper {

    public static Response post(String apiUrl, JSONObject requestBody) {
        if (requestValidator.isNotNullOrEmpty(apiUrl)) {
            return RestAssured.given().that().headers("Content-Type", "application/json", "Cookie", "did=s%3Av0%3A26d74570-6598-11ed-a3e3-4bbe80ad43ec.Wh%2FF2CHUT%2B5Gz%2BX9Cv1RJa82OldzRdyj%2F%2FdALMXz2c4; did_compat=s%3Av0%3A26d74570-6598-11ed-a3e3-4bbe80ad43ec.Wh%2FF2CHUT%2B5Gz%2BX9Cv1RJa82OldzRdyj%2F%2FdALMXz2c4").body(requestBody.toString()).when().post(apiUrl).thenReturn();

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
