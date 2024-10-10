package src.academy.devdojo.maratonajava.introduction;

public class conditionals07 {
    public static void main(String[] args) {
        double income = 11000;
        if(income <= 9500){
            System.out.println("10% = " + income * 0.1);
        } else if (income > 9500 && income <= 40525) {
            System.out.println("12% = " + income * 0.12);
        } else if (income > 40525 && income <= 63100 ){
            System.out.println("22% = " + income * 0.22);
        } else {
            System.out.println("ERROR" );
        }
    }
}
