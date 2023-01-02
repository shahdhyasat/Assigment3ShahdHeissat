package apiObjects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class loginResponseObject {


    @JsonProperty("access_token")
    private  JsonNode accessToken;
  @JsonProperty("token_type")
    private JsonNode tokenType;
    @JsonProperty("scope")
    private JsonNode scope;
    @JsonProperty("expires_in")
    private JsonNode expiresIn;

    public JsonNode getAccessToken() {
        return accessToken;
    }

    public JsonNode getScope() {

        return scope;
    }

    public JsonNode getExpiresIn() {
        return expiresIn;
    }



    public JsonNode getTokenType() {
        return tokenType;
    }
}
