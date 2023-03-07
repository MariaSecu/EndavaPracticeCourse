package practice;

public class EqualNumbers {
    public static boolean equalNumbers(int a, int b, int c) {
        if (a == b || a == c || b == c) {
            return false;
        } else {
            return true;
        }

    }


    public static void main(String[] args) {
        System.out.println(EqualNumbers.equalNumbers(3, 5, 5));
        System.out.println(EqualNumbers.equalNumbers(4, 8, 7));
    }
}


