package Helpers;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

public class Helper {
    public static void validateJSONSchema(Response response, String schemaPath){

        response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath(schemaPath));

    }
}
