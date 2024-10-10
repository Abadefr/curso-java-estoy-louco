package src.academy.devdojo.maratonajava.introduction;

import java.util.Scanner;

public class inputData01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, type your name:");
        String name = input.next();
        System.out.println("Please, type your age:");
        byte age = input.nextByte();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Program finished...");

    }
}
