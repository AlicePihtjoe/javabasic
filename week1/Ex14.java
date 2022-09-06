package week1;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");

        int number = reader.nextInt();

        if (number < 0) {
            System.out.print("This number is negative.");
        }

        if (number > 0) {
            System.out.print("This number is positive.");
        }

        if (number == 0) {
            System.out.print("Your number is equal to zero.");
        }
    }

}
