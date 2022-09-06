package week1;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the radius: ");

        int radius = reader.nextInt();

        double pi = 3.14;

        int unChangeableNr = 2;



        System.out.println("Circumference of the circle is " + radius * pi * unChangeableNr + ".");
    }
}
