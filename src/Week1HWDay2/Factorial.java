package Week1HWDay2;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] Args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number you want factorial for");
        int Number = scanner.nextInt();
        int Result = 1;
        for (int i = Number; i > 0; i--){
            Result = Result * i;
        }
        System.out.println("The Factorial of " + Number + " is " + Result);

    }
}
