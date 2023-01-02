package mappers;

import apiObjects.loginResponseObject;
import apiObjects.promotionsResponseObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;

public class promotionMappers {

    public static promotionsResponseObject readObjectPro(Response response){
        promotionsResponseObject promotionsResponseObject;
        String json= response.getBody().asString();
        ObjectMapper mapper =new ObjectMapper();

        try {
            promotionsResponseObject= mapper.readValue(json, promotionsResponseObject.class);
            return promotionsResponseObject;
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}
