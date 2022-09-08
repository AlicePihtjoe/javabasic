package week2;

import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
          Scanner reader = new Scanner(System.in);

          System.out.println("How many?");
          int howMany = Integer.parseInt(reader.nextLine());
          int count = 1;

          while(count <= howMany) {
              printText();
              count++;
          }
    }

    public static void printText() {

        System.out.println("THE WORLD IS AN ILLUSION!");
    }
}
