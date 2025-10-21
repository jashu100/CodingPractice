package Week1HWDay1;

import java.util.Scanner;

public class CelsiusToFahrenheitTypecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius (integer): ");
        int celsius = scanner.nextInt();   // Take input as int

        // Typecast int to double before arithmetic
        double fahrenheit = ((double)celsius * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}
