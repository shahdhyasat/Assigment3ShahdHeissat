package Helpers;

public class requestValidator {

    public static boolean isNotNullOrEmpty(Object param){

        return!( param== null || param.toString().isEmpty());
    }
}
