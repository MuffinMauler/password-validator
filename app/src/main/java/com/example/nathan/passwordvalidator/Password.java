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

    public static boolean containsWinkingEmoji(String pw) {
        return pw.contains(";)");
    }

    public static boolean containsGoldenGirlsStar(String pw) {
        return (pw.contains("Betty") && pw.contains("White")) ||
                (pw.contains("Bea") && pw.contains("Arthur")) ||
                (pw.contains("Rue") && pw.contains("McClanahan")) ||
                (pw.contains("Estelle") && pw.contains("Getty"));
    }

    public static boolean containsCommonHouseholdAnimalWithOnlyThreeLettersAndNoRatDoesNotCount(String pw) {
        return (pw.toLowerCase().contains("cat") || pw.toLowerCase().contains("dog"));
    }

}
