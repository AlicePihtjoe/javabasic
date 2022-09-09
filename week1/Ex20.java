package week1;

import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your username: ");
        String username = reader.nextLine();

        System.out.println("Type your password: ");
        String password = reader.nextLine();

        String firstUserName = "kasutaja";
        String firstPassword = "parool";
        String secondUserName = "kasutaja2";
        String secondPassword = "parool2";

        if (username.equals(firstUserName) && password.equals(firstPassword))  {
            System.out.println("Hi, kasutaja! You are logged in!");
        } else if (username.equals(secondUserName) && password.equals(secondPassword)){
            System.out.println("Hi, kasutaja2! You are logged in!");
        } else {
            System.out.println("Worong username and/or password!");
        }



    }
}
