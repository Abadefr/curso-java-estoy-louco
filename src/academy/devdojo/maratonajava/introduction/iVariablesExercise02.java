package src.academy.devdojo.maratonajava.introduction;

public class iVariablesExercise02 {
    public static void main(String[] args) {
        double salary = 5450.89;
        double taxPercentage = 0.1;
        double taxAmoutFromSalary = salary * taxPercentage;
        System.out.println(taxAmoutFromSalary);

        boolean condition = false;
        if (condition == true) {
            System.out.println("Inside if instruction");
        } else {
            System.out.println("Inside else");
        }
    }
}