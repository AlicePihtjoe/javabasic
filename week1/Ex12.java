package week1;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = reader.nextLine();

        System.out.println("Type your age: ");
        int age = Integer.parseInt(reader.nextLine());

        System.out.println("Type your name: ");
        String nameTwo = reader.nextLine();

        System.out.println("Type your age: ");
        int ageTwo = Integer.parseInt(reader.nextLine());

        System.out.println(name + " and " + nameTwo + " are " + Integer.sum(age, ageTwo) + " years old in total.");


    }
}
