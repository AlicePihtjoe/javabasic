package week1;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
      Scanner reader = new Scanner(System.in);

      System.out.print("Type your score: ");

      int score = reader.nextInt();

      if (score <= 29) {
          System.out.print("Failed.");
      } if (score > 29 && score <= 35) {
         System.out.print("Grade is 1.");
          }
        if (score > 35 && score <= 40) {
            System.out.print("Grade is 2.");
        }

        if (score > 40 && score <= 45) {
            System.out.print("Grade is 3.");
        }

        if (score > 45 && score <= 50) {
            System.out.print("Grade is 4.");
        }

        if (score > 50 && score <= 60) {
            System.out.print("Grade is 5.");
        }


    }

}
