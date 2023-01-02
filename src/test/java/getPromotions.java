import APIS.GetAPI;
import APIS.loginPost;
import Helpers.Helper;
import apiObjects.loginResponseObject;
import apiObjects.promotionsResponseObject;
import io.restassured.response.Response;
import jdk.nashorn.internal.ir.FunctionNode;
import mappers.loginMappers;
import mappers.promotionMappers;
import org.testng.Assert;
import org.testng.annotations.Test;

public class getPromotions extends loginTest {
     Response promotionResponse;
    @Test(description = " Login,and Validate JSON schema + Data type")

    public void getPromotion() {
        loginTest login= new loginTest();
        login.testLogin();
       String token= login.Token;
         promotionResponse= GetAPI.getPromotionsAPI(token);
         promotionResponse.getBody().prettyPrint();

         promotionsResponseObject promotion= promotionMappers.readObjectPro(promotionResponse);
        System.out.println(promotion.getId());
        String id= promotion.getId().toString();
        Assert.assertEquals(id,"5");
        validateJSONSchema(promotionResponse,"promotionSchema.json");





    }
}
