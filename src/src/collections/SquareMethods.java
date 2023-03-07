package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SquareMethods {
    public static List<Integer> pow2(Collection<Integer> collection) {
        List<Integer> squares = new ArrayList<>();
        for (int num : collection) {
            squares.add(num * num);

        }
        return squares;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(10);
        numbers.add(20);
        numbers.add(5);

        List<Integer> squares = pow2(numbers);
        System.out.println(squares);
    }
}
