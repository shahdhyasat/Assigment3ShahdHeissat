import APIS.GetAPI;
import Helpers.Helper;
import APIS.loginPost;
import apiObjects.loginResponseObject;
import io.restassured.response.Response;
import mappers.loginMappers;
import org.testng.annotations.Test;

public class loginTest extends Helper {

    Response loginResponse;
    String Token;

    @Test(description = " Login,and Validate JSON schema + Data type")

    public void testLogin() {
        loginPost loginPost = new loginPost();
        loginResponse = loginPost.loginAPI("500segmenthv@gmail.com", "Test@123");
        // loginResponseObject.getBody().prettyPrint();
        //Assert.assertFalse (response.getBody().toString().isEmpty());
        loginResponseObject loginResponseObject = loginMappers.readObjectLogin(loginResponse);
        Token = loginResponseObject.getAccessToken().asText();

        validateJSONSchema(loginResponse, "loginSchema.json");
        System.out.println(Token);


    }


}
