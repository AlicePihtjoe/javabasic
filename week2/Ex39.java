package week2;

public class Ex39 {
    private static void printStars(int amount) {
        int times = 1;
        while(times <= amount){
            System.out.print("*");
            times++;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        printStars(1);
        printStars(2);
        printStars(3);
        printStars(2);
        printStars(1);
    }
}

