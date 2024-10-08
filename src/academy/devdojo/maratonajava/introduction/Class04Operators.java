package src.academy.devdojo.maratonajava.introduction;

public class Class04Operators {

    public static void main(String[] args) {
        // + - / *
        /*int number01 = 10;
        int number02 = 20;
        int plus = number01 + number02;
        int minus = number01 - number02;
        double division = number01 / (double) number02;
        int multiplication = number01 * number02; int percentage = number01 % number02;
        int result = number01 - number02;
        System.out.println("Value :"+ plus);
        System.out.println("Value :"+ minus);
        System.out.println("Value :"+ division);
        System.out.println("Value :"+ multiplication);
        System.out.println("Value :"+ percentage);

        //< > <= >= != ==
        boolean isTenLowerThanTwenty = 10 < 20;
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLowerOrEqualsThanTwenty = 10 <= 20;
        boolean isTenGreaterOrEqualsThanTwenty = 10 >= 20;
        boolean isTenDifferentThanTwenty = 10 != 20;
        boolean isTenEqualsThanTwenty = 10 == 10;
        System.out.println("isTenLowerThanTwenty: " + isTenLowerThanTwenty  );
        System.out.println("isTenGreaterThanTwenty: " + isTenGreaterThanTwenty );
        System.out.println("isTenLowerOrEqualsThanTwenty: " + isTenLowerOrEqualsThanTwenty );
        System.out.println("isTenGreaterOrEqualsThanTwenty: " + isTenGreaterOrEqualsThanTwenty );
        System.out.println("isTenDifferentThanTwenty: " + isTenDifferentThanTwenty );
        System.out.println("isTenEqualsThanTwenty: " + isTenEqualsThanTwenty);*/

        int age = 29;
        float salary = 3500F;
        boolean isLegalOlderThanThirty = age >= 30 && salary >= 4612;
        boolean isLegalYoungerThanThirty = age < 30 && salary >= 3361;
        System.out.println("isLegalOlderThanThirty: " + isLegalOlderThanThirty );
        System.out.println("isLegalYoungerThanThirty: " + isLegalYoungerThanThirty );

        double correntAccount = 299;
        double savingsAccount = 3000;
        float playstationPrice = 500;
        boolean canBeBought = correntAccount > playstationPrice || savingsAccount > playstationPrice;
        System.out.println("canBeBought: " + canBeBought);
    }
}
