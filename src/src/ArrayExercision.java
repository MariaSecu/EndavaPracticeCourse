public class ArrayExercision {
    public static void sortTable(int[] table) {
        int n = table.length;

        // Bubble Sort
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (table[j] > table[j+1]) {
                    // swap table[j] and table[j+1]
                    int temp = table[j];
                    table[j] = table[j+1];
                    table[j+1] = temp;
                }
            }
        }
    }
}
