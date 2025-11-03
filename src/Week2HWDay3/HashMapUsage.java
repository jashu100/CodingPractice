package Week2HWDay3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapUsage {

    public static void  main(String[] args){

        HashMap<String, Double> marksMap = new HashMap<>();

        marksMap.put("A", 43.0);
        marksMap.put("B", 96.0);
        marksMap.put("C", 98.0);
        marksMap.put("D", 94.0);

        System.out.println("Hash Map Functions");
        System.out.println("Enter one Student name to get marks: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Entered name is: " + name);
        if (marksMap.containsKey(name)) {
            System.out.println("Student marks are:" + marksMap.get(name));
        } else {
            System.out.println("Student name not present");
        }
        //for finding the occurance of each element

        System.out.println("Students with marks > 50:");

        // Using Map.forEach() (no entrySet or keySet used)
        marksMap.forEach((names, marks) -> {
            if (marks > 50) {
                System.out.println(names + " → " + marks);
            }
        });

        HashMap<Double, Double> freqMap = new HashMap<>();

        for(Double marks : marksMap.values()){
            if (freqMap.containsKey(marks)) {
                freqMap.put(marks, freqMap.get(marks) + 1);
            } else {
                freqMap.put(marks, 1.0);
            }

        }

        for(Map.Entry<Double, Double> marksSet : freqMap.entrySet()){
            System.out.println("Frequencies of " + marksSet.getKey() + " is :" + marksSet.getValue());
        }

    }

}
