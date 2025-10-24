package Week1HWDay3;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int count = 0; // to count vowels

        // Convert string to lowercase for easy comparison
        input = input.toLowerCase();

        // Loop through each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i); // get character at position i

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels in the string: " + count);

        scanner.close();
    }
}

