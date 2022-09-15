package week3;
// how to reverse text
import java.util.Scanner;

public class Ex56 {
    public static void reverse(String text) {

        int count = text.length();
        int index = count -1;
        while (index >= 0) {
            System.out.print(text.charAt(index));
            index--;
        }

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your text: ");
        String text = reader.nextLine();
       reverse(text);
    }
}
