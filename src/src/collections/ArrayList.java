package collections;

import java.util.Iterator;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<>();
        list.add("home");
        list.add("table");
        list.add("a");
        list.add("desk");
        list.add("notebook");

        Iterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.length() < 3) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
