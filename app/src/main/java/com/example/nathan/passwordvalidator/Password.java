package com.example.nathan.passwordvalidator;

/**
 * Created by Nathan on 2017-05-25.
 */

public class Password {

    public static boolean isNotPassword(String pw) {
        return !pw.equalsIgnoreCase("password");
    }

    public static boolean isLongEnough(String pw) {
        return pw.length() >= 8;
    }

}
