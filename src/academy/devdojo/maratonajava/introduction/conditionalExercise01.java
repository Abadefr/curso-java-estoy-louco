package src.academy.devdojo.maratonajava.introduction;

public class conditionalExercise01 {
    public static void main(String[] args) {
        byte age = 18;
        String category = "";
        if(age <= 13){
              age = 15;
            category = "Kids";
        }else if(age > 13 && age <=17){
            age = 15;
            category = "Juvenil";
        }else {
            age = 15;
            category = "Adult";
        }

        System.out.println("The category is: " + category + "!");
    }
}
