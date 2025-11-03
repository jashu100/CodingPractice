package Week2HWDay4;

import java.io.*;

public class FileOperations {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Input.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Output.txt"));
        String line;
        int wordCount = 0;

        while((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            String[] words = line.trim().split("\\s+");
            wordCount += words.length;
        }
        System.out.println("Total word count: " + wordCount);
        bufferedWriter.write("Copied from input to output");
        bufferedReader.close();
        bufferedWriter.close();
    }
}
