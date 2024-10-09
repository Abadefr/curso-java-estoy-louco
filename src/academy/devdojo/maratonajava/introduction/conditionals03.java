package src.academy.devdojo.maratonajava.introduction;

public class conditionals03 {
    public static void main(String[] args) {
        int firstAge = 20;
        int secondAge = 21;

        // if firstAge >= secondAge: Fist age is greater or equals
        // else firstAge is not greater than secondAge: Fist age is greater or equals
        /*if (firstAge >= secondAge) {
            System.out.println("Fist age is greater:" + firstAge);
        }else {
            System.out.println("Fist age is not equals or greater:" + firstAge);
        }*/

        int salary = 5000;
        double result = 0;
        String percentegeValue = "";
        /*double salary30Percentage = salary * 0.30;
        double salary15Percentage = salary * 0.15;*/
        if(salary >= 5000){
             result = salary * 0.30;
             percentegeValue = "30%";
            //System.out.println(" salary percentage:" + result);
        } else {
             result = salary * 0.15;
            percentegeValue = "30%";
            //System.out.println(" salary percentage:" + result);
        }

        System.out.println(percentegeValue + " = " + result);
    }
}
