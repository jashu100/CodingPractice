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
        marksMap.put("E", 94.0);
        marksMap.put("F", 96.0);


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

        System.out.println("Using Key Set");
        for(String key : marksMap.keySet()){
            double marks = marksMap.get(key);
            if(marks > 50) {
                System.out.println(key + "--" + marks );
            }
        }

        System.out.println("Using Entry Set");
        for(Map.Entry<String, Double> map1 : marksMap.entrySet()){
            if(map1.getValue() > 50){
                System.out.println(map1.getKey() + "--" + map1.getValue());
            }
        }
        System.out.println("not Using Key Set and entry set");
        marksMap.forEach((key1, value1) -> {
            if( value1 > 50.0) {
                System.out.println(key1 + "--" + value1 );
            }
        });

    }

}
