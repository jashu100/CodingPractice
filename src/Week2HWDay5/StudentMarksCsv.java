package Week2HWDay5;

import java.io.*;

public class StudentMarksCsv {

    public static void main(String[] args){


        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("Input.csv"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Output.csv"));
            String line;

            String header = bufferedReader.readLine();
            bufferedWriter.write("name,total,average\n");

            while((line = bufferedReader.readLine()) != null){
                String[] parts = line.split(",");
                String name = parts[0];
                int total = 0;
                for(int i =1; i < parts.length; i++){
                    total = total + Integer.parseInt(parts[i]);
                }
                double avg = (double) total / (parts.length - 1);
                bufferedWriter.write(name + "," + total + "," + avg + "\n");
            }

            bufferedWriter.close();
            bufferedReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
