package week4;

public class Ex79 {

    public static void main(String[] args) {

        NumberStatistics stats = new NumberStatistics(0);
        stats.addNumber(1);
        stats.addNumber(1);
        stats.addNumber(1);
        stats.addNumber(1);

        System.out.println("Amount :" + stats.amountOfNumbers());
        System.out.println("sum: " + stats.sum());
        System.out.println("average: " + stats.average());

    }
}
