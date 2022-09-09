package week1;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the first number: ");
        int numOne = reader.nextInt();

        System.out.println("Type the second number: ");
        int numTwo = reader.nextInt();

        if(numOne > numTwo) {
            System.out.println("Greater number " + numOne);
        } else if (numOne < numTwo){
            System.out.println("Greater number " + numTwo);
        } else {
            System.out.println(numOne + " and " + numTwo + " are even!");
        }


    }
}
