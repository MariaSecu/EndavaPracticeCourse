package inputOutput;

import java.io.*;

public class InsertText {

    public static void main(String[] args) throws IOException {
        try {

            File inputFile = new File("input.txt");
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            File outputFile = new File("output.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("File copied successfully.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }

    }
}
