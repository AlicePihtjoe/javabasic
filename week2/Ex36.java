package week2;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");

        int number;
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        while (true) {
            number = Integer.parseInt(reader.nextLine());

            if (number == 0) {
                break;
            }

            sum += number; // sum = sum + number
            count++;

            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

System.out.println("Thanks! ");
        System.out.println("The sum of numbers is " + sum + ".");
        System.out.println("There are " + count + " numbers. ");
        double average = (double)sum / count;
        System.out.println("The average of the numbers is " + average + ".");
        System.out.println("Even numbers: " + even + ".");
        System.out.println("Odd numbers: " + odd + ".");
    }
}
