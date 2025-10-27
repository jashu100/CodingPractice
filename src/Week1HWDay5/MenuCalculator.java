package Week1HWDay5;

import java.util.Scanner;

public class MenuCalculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return (double) a / b;
    }

    public static double power(int base, int exponent) {
        return Math.pow(base, exponent);
    }

    public static int reverseNumber(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Power");
            System.out.println("6. Reverse Number");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            int a, b;

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Result: " + add(a, b));
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Result: " + subtract(a, b));
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Result: " + multiply(a, b));
                    break;

                case 4:
                    System.out.print("Enter two numbers: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Result: " + divide(a, b));
                    break;

                case 5:
                    System.out.print("Enter base and exponent: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Result: " + power(a, b));
                    break;

                case 6:
                    System.out.print("Enter number to reverse: ");
                    a = sc.nextInt();
                    System.out.println("Reversed: " + reverseNumber(a));
                    break;

                case 7:
                    System.out.println("Exiting Calculator. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}

