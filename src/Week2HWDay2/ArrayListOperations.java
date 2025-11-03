package Week2HWDay2;

import java.util.*;

public class ArrayListOperations {

    public static void main(String[] args){


        List<String> names= new ArrayList<>();

        System.out.println("Initial Names in ArrayList are :" + names.toString());

        names.add("Alex");
        names.add("Bobby");
        names.add("Daniel");
        names.add("Carry");

        System.out.println("Names in ArrayList after add operation are :"+ names.toString());

        for(String name : names){
                System.out.println("Using for each Loop filtering " + name);
        }

        for(String name : names){
            if(name.startsWith("A")){
                System.out.println("Using for each Loop filtering " + name);
            }
        }

        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            System.out.println("Using Iterator Loop filtering " + iterator.next());
        }

        Collections.sort(names);

        System.out.println("Sorted List " + names);

        names.remove("Bobby");

        System.out.println("Names in ArrayList after remove operation are :" + names);

        names.add("Daniel");

        Set<String> seenset = new HashSet<>();
        Set<String> duplicateset = new HashSet<>();

        for(String name : names){
            if(!(seenset.add(name))){
                duplicateset.add(name);

            }
        }
        System.out.println("Duplicates elements in List are :" + duplicateset);


        List<Integer> marks = new ArrayList<>();

        marks.add(35);
        marks.add(45);
        marks.add(55);
        marks.add(65);

        System.out.println("Sum of elements in List are :" + marks.stream().mapToInt(Integer :: intValue).sum());
        System.out.println("Average of elements in List are :"
                + marks.stream().mapToInt(Integer :: intValue).sum()/marks.size());
        System.out.println("Sum of elements in List are :"
                + marks.stream().mapToInt(Integer :: intValue).average().getAsDouble());




    }

}
