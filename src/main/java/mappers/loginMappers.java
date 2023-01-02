package mappers;

import apiObjects.loginResponseObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;

public class loginMappers {

    public static loginResponseObject readObjectLogin(Response response){
        loginResponseObject loginResponseObject;
       String json= response.getBody().asString();
        ObjectMapper mapper =new ObjectMapper();

        try {
           loginResponseObject= mapper.readValue(json, loginResponseObject.class);
           return loginResponseObject;
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}
