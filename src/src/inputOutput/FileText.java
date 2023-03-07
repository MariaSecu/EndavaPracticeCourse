package inputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileText {

    public static void main(String[] args) {
        File file = new File("exemple.txt");
        try {
            PrintWriter writer = new PrintWriter(file);
            writer.println("This is an example of text: ");
            writer.println("The second line of text");
            writer.println("The third line of text");
            writer.println("This can be some text ");
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file can't be created ");
            return;
        }

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("This file was not found ");
            return;
        }
    }
}
