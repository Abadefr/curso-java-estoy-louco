package src.academy.devdojo.maratonajava.introduction;

public class conditionals06 {
    public static void main(String[] args) {
        short  ps5Price = 500;
        short creditCard =5000;
        short checkingAccountValue = 400;
        short savingsAccountValue = 200;

        if (creditCard > ps5Price || checkingAccountValue > ps5Price || savingsAccountValue > ps5Price){
            System.out.println("purchase made successfully! ");
        }else {
            System.out.println("Unfortunately, it was not possible to complete the purchase.");
        }
    }
}
