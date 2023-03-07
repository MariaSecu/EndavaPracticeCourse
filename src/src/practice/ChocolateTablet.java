package practice;

import java.util.Scanner;

public class ChocolateTablet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        if (k <= n * m && (k % n == 0 || k % m == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
