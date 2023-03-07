package inputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) {
        String word = "emotions";

        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);

            int count = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("\\s+");
                for (String w : words) {
                    if (w.equalsIgnoreCase(word)) {
                        count++;
                    }
                }
            }
            scanner.close();
            System.out.println("The word \"" + word + "\" appears " + count + " times in the file.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
