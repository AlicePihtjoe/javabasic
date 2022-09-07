package week1;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Hi! If you want to know a secret, type the password!");

        while(true) {
            System.out.print("The password: ");

            String pwd = reader.nextLine();

            if (pwd.equals("parool")) {
                System.out.print("Correct! The secret is: There exist creatures that are called the nudibranchs. Look it up.");
                break;
            } else {
                System.out.print("Wrong, try again! ");

            }


        }

        }
    }
