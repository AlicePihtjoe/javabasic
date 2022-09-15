package week2;

// kõik on katki, peab uuesti tegema


import java.util.Scanner;

public class Ex25 {
 public static void main(String[] args) {
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    int sum = 0;

    Scanner reader = new Scanner(System.in);

  System.out.println("Enter the first number: ");
    num1 = reader.nextInt();

System.out.println("Enter the second number: ");
    num2 = reader.nextInt();

System.out.println("Enter the third number: ");
    num3 = reader.nextInt();
    sum = sum(num1, num2, num3);

System.out.println("The sum of numbers is " + sum);
}
    public static int sum(int a, int b, int c)
    {
        int sum = a + b + c;
        return sum;
    }
}