//Combine factorial, palindrome, reverse, even/odd checks in one program. Test concepts learned.

package Week1Test;

import java.util.Scanner;

public class Week1Test {

    public static void main(String[] args){

        double fact;
        String palindrome;
        String reverseString = "";

        // factorial

        System.out.println("Enter a number for factorial");

        Scanner Sc = new Scanner(System.in);

        int number = Sc.nextInt();
        double initialfact = 1;

        for(int i = 1; i <= number; i++)
        {
            initialfact = initialfact * i;
        }
        System.out.println("factorial of number : " + initialfact);

        // even or odd

        if(number%2 == 0){
            System.out.println("Number is even");
        }
        else
            System.out.println("Number is Odd");

        // Plaindrome

        System.out.println("Enter the String for Palindrome Check");

        Scanner Sc1 = new Scanner(System.in);

        palindrome = Sc1.nextLine();
        for( int i = palindrome.length() - 1; i >= 0; i-- ){
            reverseString = reverseString + palindrome.charAt(i);
        }
        System.out.println(reverseString);

        // Reverse of Number

        System.out.println("Enter the Number for reversing it");

        Scanner Sc2 = new Scanner(System.in);

        int originalNum = Sc2.nextInt();
        int ReverseNum = 0;

        while(originalNum != 0){
            ReverseNum =  ReverseNum * 10 +  originalNum%10;
            originalNum = originalNum/10;
        }
        System.out.println("Reverse Number is " + ReverseNum);
    }
}
