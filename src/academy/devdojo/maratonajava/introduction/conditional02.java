package src.academy.devdojo.maratonajava.introduction;

public class conditional02 {
    public static void main(String[] args) {
        float salaryManager = 5000;
        float salaryDeveloper = 3500;
        /*if (salaryManager > salaryDeveloper
        if (salaryManager < salaryDeveloper
        if (salaryManager >= salaryDeveloper
        if (salaryManager <= salaryDeveloper
        if (salaryManager != salaryDeveloper*/
        if (salaryManager > salaryDeveloper) {
            System.out.println("salary manager is higher:$" + salaryManager);
        } else {
            System.out.println("Developer's salary is lower than manager's:$" + salaryDeveloper);
        }

    }
}
