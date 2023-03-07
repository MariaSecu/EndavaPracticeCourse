package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NewMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Cherry");
        map.put(3, "Blueberry");
        map.put(4, "Pineapple");
        map.put(5, "Watermelon");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String to search in the map: ");
        String searchValue = scanner.nextLine();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals(searchValue)) {
                System.out.println("Key found: " + entry.getKey());
                return;
            }
        }
        System.out.println("No key found for the searched value. ");
    }
}
