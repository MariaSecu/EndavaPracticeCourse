package inputOutput;

import java.io.*;

public class WordSubstitution {

    public static void main(String[] args) throws IOException {
        String oldWord = "emotions";
        String newWord = "feelings";

        try {
            File inputFile = new File("input.txt");
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            File temp = new File("temp.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(temp));

            String line;
            while ((line = reader.readLine()) != null) {
                String newLine = line.replaceAll(oldWord, newWord);
                writer.write(newLine);
            }

            reader.close();
            writer.close();
            System.out.println("File updated successfully.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
