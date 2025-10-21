package Week1HWDay1;

import java.util.Scanner;

public class SumOfFiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter 5 numbers separated by spaces:");
        // Read all numbers in one line
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();

        // Calculate sum
        sum = num1 + num2 + num3 + num4 + num5;

        // Display result
        System.out.println("The sum of the 5 numbers is: " + sum);

        scanner.close();
    }
}
