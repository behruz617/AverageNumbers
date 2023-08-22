import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number ");
        int number = sc.nextInt();

        int sumDividedByFourAndFive = 0;
        int dividedByFourAndFive = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 4 == 0 && i % 5 == 0) {
                System.out.println(i);

                sumDividedByFourAndFive = sumDividedByFourAndFive + i;
                dividedByFourAndFive++;

            }
        }
        double average = (double) sumDividedByFourAndFive / dividedByFourAndFive;
        System.out.println();

        System.out.println("The average of these numbers : " + average);

    }
}
