package week1;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter a number: ");

    int num = reader.nextInt();

    if (num % 2 == 0)
        System.out.print(num + " is an even number.");
    else
        System.out.print(num + " is an odd number.");
}
}