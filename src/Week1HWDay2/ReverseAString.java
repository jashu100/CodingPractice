package Week1HWDay2;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();  // read the full line including spaces

        String reversed = "";  // to store the reversed string

        // loop through the string from end to start
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}
