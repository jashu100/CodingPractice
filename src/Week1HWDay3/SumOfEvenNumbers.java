package Week1HWDay3;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = scanner.nextInt();

        int sum = 0; // variable to store the total

        // Loop through first N even numbers
        for (int i = 1; i <= n; i++) {
            int even = 2 * i;   // generates even number (2, 4, 6, 8, ...)
            sum += even;        // add to sum
        }

        System.out.println("Sum of first " + n + " even numbers is: " + sum);

        scanner.close();
    }
}

