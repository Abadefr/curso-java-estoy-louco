package src.academy.devdojo.maratonajava.introduction;

public class conditional05 {
    public static void main(String[] args) {
        String savedName = "Lucas Ferreira Castro";
        String savedCreditCardNumber = "678-654-765-89";
        String savedSecurityCode = "30";

        String inputSavedName = "Lucas Ferreira Castro";
        String inputSavedCreditCardNumber = "678-654-765-89";
        String inputSavedSecurityCode = "300";

        if (savedName.equals(inputSavedName) && savedCreditCardNumber.equals(inputSavedCreditCardNumber) && savedSecurityCode.equals(inputSavedSecurityCode)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
