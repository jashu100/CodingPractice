package Week1HWDay3;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string or number: ");
        String input = scanner.nextLine();

        String reversed = "";  // to store reversed string

        // Loop to reverse the string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Check if input and reversed string are same (ignoring case)
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        scanner.close();
    }
}

