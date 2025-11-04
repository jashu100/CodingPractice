//Validate all calculations & file operations.

package Week2Test;


import java.io.*;
import java.util.*;

public class AllOperationsTogether {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter no of Students");

    //Array Functions :

        int[] studentmarks = { 3, 4, 5, 6, 7};

        System.out.println("Sum of elements :" + Arrays.stream(studentmarks).sum());
        System.out.println("Avg of elements :" + Arrays.stream(studentmarks).average().getAsDouble());
        System.out.println("Max of elements :" + Arrays.stream(studentmarks).max().getAsInt());
        System.out.println("Min of elements :" + Arrays.stream(studentmarks).min().getAsInt());

        // ArrayList Functions

        List<Integer> list = new ArrayList<>();


        list.add(9);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(4);
        list.add(9);

        System.out.println("List of numbers is :" + list);

        Collections.sort(list);

        System.out.println("After Sorting" +list);

        int sum = list.stream().mapToInt(Integer::intValue).sum();
        int avg = list.stream().mapToInt(Integer::intValue).sum()/list.size();

        System.out.println("List sum " + sum);
        System.out.println("List Average " + avg);


        //Map functions

        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("a", 1);
        hashMap.put("b", 2);
        hashMap.put("c", 3);
        hashMap.put("d", 1);

        System.out.println("Value of a : "+ hashMap.get("a"));

        if(hashMap.containsKey("b")){
            System.out.println("Value of b : "+ hashMap.get("b"));

        }

        BufferedReader bufferedReader = new BufferedReader(new FileReader("Input.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Output.txt"));
        String line;
        while((line = bufferedReader.readLine()) != null){
            System.out.println(line);
            bufferedWriter.write(line);
            bufferedWriter.write("\n");
        }

        bufferedWriter.write("In Test read/write operations");

        bufferedReader.close();
        bufferedWriter.close();

    }
}
