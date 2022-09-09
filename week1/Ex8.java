package week1;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        System.out.println("Type another number: ");
        int anotherNumber = Integer.parseInt(reader.nextLine());

        System.out.println("The sum of the numbers " + (number + anotherNumber));
    }
}
