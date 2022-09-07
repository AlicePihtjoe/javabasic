package week1;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter your age: ");

        int age = reader.nextInt();

        if (age < 0) {
            System.out.print("Impossible!");
        }

        else if (age > 100) {
            System.out.print("You are either very old or lying..");
        }

        else {
            System.out.print("Okay.");
        }
    }
}
