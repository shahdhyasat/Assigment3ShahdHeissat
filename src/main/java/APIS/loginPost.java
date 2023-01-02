package APIS;

import Helpers.postApiHelper;

import constents.APIconstants;
import io.restassured.response.Response;
import org.json.JSONObject;

public class loginPost {

    public static Response apiRessponse;

    public Response loginAPI(String Username, String Password){

        JSONObject jsonObject = new JSONObject("{ \"grant_type\":\"password\"," +
                "\"username\":"+Username+"," +
                "\"password\":"+Password+"," +
                "\"audience\":\"https://sit.maf-dev.auth0.com/api/v2/\"," +
                "\"client_id\":\"l9DGyNKhON48e6BgTFAg17wWY78urJ4t\"," +
                "\"client_secret\":\"yl9xlvv9N35GpLYDxBp22HLFvPv4_RrtPQxFhznSV2C5xqUYWVWqXl7qwdt2gq2f\"}");
        apiRessponse = postApiHelper.post(APIconstants.loginURL, jsonObject);

        return apiRessponse;



    }
}
