package practice;

import java.util.Scanner;

public class FillTheMatrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti dimensiunea matricei: ");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];


        if (n < 100) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        matrix[i][j] = 0;
                    } else if (i == j - 1 || i == j + 1) {
                        matrix[i][j] = 1;
                    } else if (i == j - 2 || i == j + 2) {
                        matrix[i][j] = 2;
                    } else if (i == j - 3 || i == j + 3) {
                        matrix[i][j] = 3;
                    } else if (i == j - 4 || i == j + 4) {
                        matrix[i][j] = 4;
                    } else {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        System.out.println("The Matrix is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
