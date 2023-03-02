public class Execution {
    public static void main(String[] args) {

        int[] table = {6,3,2,4,3,5,9,1};

        ArrayExercision.sortTable(table);

        // Print sorted table
        System.out.println("Sorted bubble Table:");
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i] + " ");
        }
    }
}
