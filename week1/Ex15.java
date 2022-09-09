package week1;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your age: ");
        int age = Integer.parseInt(reader.nextLine());

        if (age < 18) {
            System.out.println("You have not reached the age of maturity yet.");
        } else {
            System.out.println("You are mature.");
        }
    }
}
