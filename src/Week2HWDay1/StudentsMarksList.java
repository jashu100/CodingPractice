package Week2HWDay1;

import java.util.Arrays;
import java.util.Scanner;

public class StudentsMarksList {

    public static void main(String[] args) {

        System.out.println("Enter no of Students");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int[] studentMarks = new int[no];
        int[] reversedMarks = new int[no];
        System.out.println("Enter marks for " + no + " Students");
        for(int i = 0; i < no; i++) {
            studentMarks[i] = sc.nextInt();
        }
        for(int i = 0; i < no; i++){
            System.out.println("Entered marks for Student " + (i+1) +" :"+ studentMarks[i]);
        }

        float maxMarks = Arrays.stream(studentMarks).max().getAsInt();
        float minMarks = Arrays.stream(studentMarks).min().getAsInt();
        float averageMarks = (float) Arrays.stream(studentMarks).sum() / no;

        System.out.println("Maximum marks for Student is " + maxMarks);
        System.out.println("Maximum marks for Student is " + minMarks);
        System.out.println("Average marks for Student is " + averageMarks);
        System.out.println("Sum of marks of All Students is " + Arrays.stream(studentMarks).sum());

        System.out.println("Original Array is :" + Arrays.toString(studentMarks));

        System.out.print("Reversed Array is : ");
        for (int i = studentMarks.length - 1; i >= 0; i--) {
            System.out.print(studentMarks[i] + " ");
        }


    }
}
