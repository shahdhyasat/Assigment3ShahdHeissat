package constents;

public class APIconstants {
    public static String loginURL;
    public static String BaseURL;
    public static String promotionsPATH;
    public static String devURL;


    static {
        BaseURL="https://sit.maf-dev.auth0.com";
        devURL= "https://maf-holding-dev.apigee.net";
        loginURL= BaseURL+"/oauth/token";
        promotionsPATH=devURL+"/v1/share/promote-sections/5";
    }
}
