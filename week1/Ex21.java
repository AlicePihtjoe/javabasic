package week1;

// leap year exercise

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Type the year: ");

        int year = reader.nextInt();

        if (year % 100 == 0 || year % 400 == 0 || year % 4 == 0) {
            System.out.print("this is a leap year.");
        }

        else {
            System.out.print("This year is not a leap year.");
        }


    }
}
