package APIS;

import Helpers.getAPIHelper;
import Helpers.postApiHelper;
import apiObjects.loginResponseObject;
import constents.APIconstants;
import io.restassured.response.Response;
import org.json.JSONObject;

public class GetAPI  {

   public static Response getAPIRessponse;

   public static Response getPromotionsAPI(String token) {


        getAPIRessponse = getAPIHelper.get(APIconstants.promotionsPATH,token );

        return getAPIRessponse;



    }
}
